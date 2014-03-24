package logic.deduction;

import game.GameInfo;
import game.GameState;

import java.util.ArrayList;
import java.util.List;

import logic.Reason;
import logic.conclusion.Conclusion;
import logic.conclusion.PlayerDefinitelyDoesNotHaveCardConclusion;
import player.Player;
import card.Card;
import checklist.ChecklistValue;

/**
 * If one player has a card, nobody else can have that card
 * @author Kapil
 */
public class HorizontalUniquenessDeduction implements Deduction {

	@Override
	public List<Conclusion> run(GameState state, GameInfo info) {
		List<Conclusion> conclusions = new ArrayList<>();
		
		for (Player player : state.getPlayers()) {
			for (Card card : state.getCardList().getAll()) {
				run(state, info, conclusions, player, card);
			}
		}
		
		return conclusions;
	}
	
	private void run(GameState state, GameInfo info, List<Conclusion> conclusions, Player player, Card card) {
		if (info.getChecklist().getValue(player, card) == ChecklistValue.DEFINITELY_DOES_HAVE) {
			//player has card, mark it as not had by any other player
			for (Player player2 : state.getPlayers()) {
				if (player.equals(player2)) continue;
				
				conclusions.add(new PlayerDefinitelyDoesNotHaveCardConclusion(
					player2, card,
					Reason.HORIZONTAL_UNIQUENESS
				));
			}
		}
	}

}

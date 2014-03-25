package logic.deduction;

import game.Game;

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
	public List<Conclusion> run(Game game) {
		List<Conclusion> conclusions = new ArrayList<>();
		
		for (Player player : game.getState().getPlayers()) {
			for (Card card : game.getState().getCardList().getAll()) {
				run(game, conclusions, player, card);
			}
		}
		
		return conclusions;
	}
	
	private void run(Game game, List<Conclusion> conclusions, Player player, Card card) {
		if (game.getInfo().getChecklist().getValue(player, card) == ChecklistValue.DEFINITELY_DOES_HAVE) {
			//player has card, mark it as not had by any other player
			for (Player player2 : game.getState().getPlayers()) {
				if (player.equals(player2)) continue;
				
				conclusions.add(new PlayerDefinitelyDoesNotHaveCardConclusion(
					player2, card,
					Reason.SOMEBODY_ELSE_HAS_CARD
				));
			}
		}
	}

}

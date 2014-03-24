package logic.deduction;

import game.GameInfo;
import game.GameState;

import java.util.ArrayList;
import java.util.List;

import logic.ConclusionAndReasons;
import player.Player;
import card.Card;
import checklist.ChecklistValue;

public class HorizontalUniquenessDeduction implements Deduction {

	@Override
	public List<ConclusionAndReasons> run(GameState state, GameInfo info) {
		List<ConclusionAndReasons> conclusions = new ArrayList<>();
		
		for (Player player : state.getPlayers()) {
			for (Card card : state.getCardList().getAll()) {
				run(state, info, conclusions, player, card);
			}
		}
		
		return conclusions;
	}
	
	private void run(GameState state, GameInfo info, List<ConclusionAndReasons> conclusions, Player player, Card card) {
		if (info.getChecklist().getValue(player, card) == ChecklistValue.DEFINITELY_DOES_HAVE) {
			//player has card, mark it as not had by any other player
			for (Player player2 : state.getPlayers()) {
				if (player.equals(player2)) continue;
				
				//TODO create conclusion to mark player2 as not having that card
			}
		}
	}

}

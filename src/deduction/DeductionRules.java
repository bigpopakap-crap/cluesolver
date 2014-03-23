package deduction;

import game.GameInfo;
import game.GameState;

import java.util.Collections;
import java.util.List;

import player.Player;
import card.Card;
import checklist.ChecklistValue;

public enum DeductionRules implements DeductionRule {
	/**
	 * If a player is known to have a card, no other players have that card
	 */
	HORIZONTAL_UNIQUENESS {
		@Override
		public List<Conclusion> run(GameState state, GameInfo info) {
			List<Conclusion> conclusions = Collections.emptyList();
			
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
					
					//TODO create conclusion to mark player2 as not having that card
				}
			}
		}
	},
	
	HORIZONTAL_UNIQUENESS_INVERSE,
	
	VERTICAL_EXACTNESS,
	VERTICAL_EXACTNESS_INVERSE,
	
	CASE_FILE_TYPE_UNIQUENESS,
	CASE_FILE_TYPE_UNIQUENESS_INVERSE,
	
	REFUTATION_PASSED,
	REFUTATION_SEEN,
	REFUTATION_KNOWN,
	REFUTATION_DEDUCED;

	@Override
	public List<Conclusion> run(GameState state, GameInfo info) {
		// default: don't do anything
		return Collections.emptyList();
	}
	
}

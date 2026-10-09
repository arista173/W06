package lab.poker;
import java.util.List;

import static lab.poker.HandType.FULL_HOUSE;
import static lab.poker.HandType.STRAIGHT_FLUSH;

/** House rule: a straight flush or a full house earns a bonus. */
public class BonusPolicy {
    private final PokerHandEvaluator evaluator = new PokerHandEvaluator();
    public boolean qualifies(List<Card> hand) {
        HandType type = evaluator.classify(hand);
        return type == STRAIGHT_FLUSH || type == FULL_HOUSE;
    }
}

package lab.poker;
import java.util.List;

/** House rule: a straight flush or a full house earns a bonus. */
public class BonusPolicy {
    private final PokerHandEvaluator evaluator = new PokerHandEvaluator();
    public boolean qualifies(List<Card> hand) {
        HandType type = evaluator.classify(hand);
        return type == HandType.STRAIGHT_FLUSH || type == HandType.FULL_HOUSE;
    }
}

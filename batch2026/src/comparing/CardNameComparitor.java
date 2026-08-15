package comparing;

import java.util.Comparator;

public class CardNameComparitor implements Comparator<Card> {
    @Override
    public int compare(Card c1, Card c2) {
        return c1.getName().compareTo(c2.getName());
    }
}

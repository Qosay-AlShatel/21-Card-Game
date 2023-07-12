package game.cards;

public class Card{

    private Rank rank;
    private Suit suit;

    public Card(Rank r, Suit s)
    {
        rank = r;
        suit = s;
    }


    public String toString()
    {
        return rank + " " + suit;
    }

    enum Rank
    {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE;
    }


    enum Suit
    {
        HEARTS,
        SPADES,
        CLUBS,
        DIAMONDS;
    }

}

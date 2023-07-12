package game.cards;

//import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck
{
    private static Deck instance = null;

    private Stack<Card> deck;

    public Stack<Card> getDeck()
    {
        return deck;
    }

    private Deck ()
    {
        deck = new Stack<>();
    }

    public static Deck getInstance ()
    {
        if (instance == null)
        {
            instance = new Deck ();
        }

        return instance;
    }



    public Deck randomCards()
    {
        ArrayList<Card> randomDeck = new ArrayList<>();
        for(Card.Rank r: Card.Rank.values())
            for(Card.Suit s: Card.Suit.values())
                randomDeck.add(new Card(r,s));

        Collections.shuffle((randomDeck));

        for(int i=0;i<21;i++)
            deck.push(randomDeck.get(i));

        return getInstance();
    }

    public String logger()
    {
        String x = "";

        Iterator<Card> sIterator = getInstance().deck.iterator();

        int counter = 3;

        while(sIterator.hasNext())
        {
            String j =
                    x += String.format("%-18s",sIterator.next());

            counter--;

            if(counter == 0)
            {
                x += "\n";
                counter = 3;
            }

        }
        return x;
    }



    public void handOutCards()
    {
        Iterator<Card> sIterator = getInstance().deck.iterator();

        int counter = 3;

        while(sIterator.hasNext())
        {
            System.out.printf("%-18s",sIterator.next());
            counter--;
            if(counter == 0)
            {
                System.out.println();
                counter = 3;
            }

        }
    }


    public void chosenColumn(Queue<Card> q1, Queue<Card> q2, Queue<Card> q3, int c)
    {
        Iterator<Card> q1Iterator = q1.iterator();
        Iterator<Card> q2Iterator = q2.iterator();
        Iterator<Card> q3Iterator = q3.iterator();


        while(!deck.isEmpty())
            deck.pop();

        switch(c)
        {
            case 1:
                while(q2Iterator.hasNext())
                {
                    deck.push(q2Iterator.next());
                }
                while(q1Iterator.hasNext())
                {
                    deck.push(q1Iterator.next());
                }
                while(q3Iterator.hasNext())
                {
                    deck.push(q3Iterator.next());
                }
                break;

            case 2:
                while(q1Iterator.hasNext())
                {
                    deck.push(q1Iterator.next());
                }
                while(q2Iterator.hasNext())
                {
                    deck.push(q2Iterator.next());
                }
                while(q3Iterator.hasNext())
                {
                    deck.push(q3Iterator.next());
                }
                break;

            default:
                while(q2Iterator.hasNext())
                {
                    deck.push(q2Iterator.next());
                }
                while(q3Iterator.hasNext())
                {
                    deck.push(q3Iterator.next());
                }
                while(q1Iterator.hasNext())
                {
                    deck.push(q1Iterator.next());
                }
                break;

        }

    }
}

import game.cards.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.File;

public class Main
{
    public static void main(String [] args )
    {
        Deck d = Deck.getInstance();
        d.randomCards();

        Queue<Card> q1;
        Queue<Card> q2;
        Queue<Card> q3;

        Iterator<Card> sIterator;

        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

        File log = new File(timeStamp);

        try{

            BufferedWriter dst = new BufferedWriter (new OutputStreamWriter (new FileOutputStream (timeStamp , true)));

            dst.write("Original 21 cards : \n");

            for(int i=0;i<3;i++)
            {

                sIterator = d.getDeck().iterator();

                q1 = new Queue<>();
                q2 = new Queue<>();
                q3 = new Queue<>();

                d.handOutCards();

                dst.write(d.logger());
                dst.write("\n");

                System.out.println("\nChoose the column where your card is :");

                Scanner sc= new Scanner(System.in);

                int x = sc.nextInt();

                System.out.println("\n");

                dst.write("The player chose column number " + x + "\n\n\n");

                while(sIterator.hasNext())
                {
                    q1.enQ(sIterator.next());
                    q2.enQ(sIterator.next());
                    q3.enQ(sIterator.next());
                }

                d.chosenColumn(q1,q2,q3,x);

            }

            for(int i = 0;i<10;i++)
                d.getDeck().pop();

            sIterator = d.getDeck().iterator();

            String chosenCard = sIterator.next().toString();

            System.out.println("The card is : " + chosenCard);

            dst.write("The player's card was : " + chosenCard);

            dst.close();
        }

        catch (IOException e)
        {
            System.out.println ("File error");

        }

    }
}


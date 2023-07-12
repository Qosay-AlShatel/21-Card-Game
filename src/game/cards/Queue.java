package game.cards;

import java.util.ArrayList;
import java.util.Iterator;

public class Queue<T> implements Iterable <T>
{
    ArrayList<T> qList;

    public Queue ()
    {
        qList= new ArrayList<T> ();
    }

    public void enQ (T element)
    {
        qList.add (element);
    }

    public T deQ ()
    {
        T item= null;

        if (this.size () > 0)
            item= qList.remove (0);

        return item;
    }

    public int size ()
    {
        return qList.size ();
    }

    public void printQ ()
    {
        for (T element : qList)
            System.out.print (element + " ");

        System.out.println ();
    }


    private class InternalImplementor implements Iterator<T>
    {
        private int nextIndex = 0;
        private int lastIndex = -1;

        public boolean hasNext ()
        {
            return nextIndex != qList.size();
        }

        public T next ()
        {
            lastIndex = nextIndex;
            nextIndex++;

            return qList.get(lastIndex);
        }
    }

    public Iterator<T> iterator ()
    {
        return new InternalImplementor ();
    }

}

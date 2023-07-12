package game.cards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T>
{
    private ArrayList<T> sList;

    public Stack() {
        sList = new ArrayList<>();
    }

    public void push(T element) {
        sList.add(element);
    }

    public T pop() {
        T tempElement = null;

        if (sList.size() != 0)
            tempElement = sList.remove(sList.size() - 1);

        return tempElement;
    }

    public int size() {
        return sList.size();
    }

    public boolean isEmpty() {
        return sList.isEmpty();
    }

    public T peek() {
        T tempElement = null;

        if (sList.size() != 0)
            tempElement = sList.get(sList.size() - 1);

        return tempElement;
    }

    private class InternalImplementor implements Iterator<T> {
        int pos = sList.size()-1;

        public boolean hasNext() {
            return pos >= 0;
        }

        public T next() {
            T c = sList.get(pos);
            pos--;
            return c;
        }
    }

    public Iterator<T> iterator() // a factory method that returns an instance of the iterator
    {
        return new InternalImplementor();
    }

}


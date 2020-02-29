package fr.umlv.exam;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class CactusList<E> implements Iterable {
    //private Object[] list;
    private E[] list;
    private int counter;
    private static int INIT_SIZE = 200;
    private int index;
    private boolean isFrozen;

    public CactusList() {
        this.list = (E[]) new Object[INIT_SIZE];
        this.counter = 0;
        this.index = 0;
    }

    public void add(E element) {
        Objects.requireNonNull(element);
        /*
        if (!(element instanceof ) ) {
            throw new IllegalArgumentException();
        }
         */
        while (listShouldBeGrow()) { // Mais attention a la mémoire
            this.growCactusList();
        }

        list[index] = element;
        this.index++;
        this.counter++;
    }

    public void addCactus(CactusList<? extends E> cactusList) {
        Objects.requireNonNull(cactusList);


        for (var elt : cactusList) {
            while (listShouldBeGrow()) { // Mais attention a la mémoire
                this.growCactusList();
            }
            list[index] = (E) elt;
            this.index++;
            this.counter++;
        }


    }

    private boolean listShouldBeGrow() {
        return (this.list.length / 2) < this.index;
    }

    private void growCactusList() {
        var newLength = this.list.length * 2;
        this.list = Arrays.copyOf(list, newLength);
    }

    public int size() {
        return this.counter;
    }

    @Override
    public Iterator iterator() {
        return new Iterator<E>() {

            private int cursor = this.nextToReturn(0);

            private int nextToReturn(int from) {
                for (var firstElt = from; firstElt < list.length; firstElt++) {
                    if (list[firstElt] != null) {
                        return firstElt;
                    }
                }
                return -1; // -1 si plus personne
            }

            @Override
            public boolean hasNext() {
                return cursor != -1;
            }

            @Override
            public E next() {
                if (!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                var tmp = cursor;
                cursor = this.nextToReturn(cursor + 1);
                return list[tmp];

            }
        };
    }
}

package myCollection;

import myCollection.MyCollection;

import java.util.EmptyStackException;

public class MyCollectionImpl implements MyCollection {

    private MyNode firstElement;
    private MyNode lastElement;
    private int size = 0;


@Override
        public void enqueue(MyNode myNode) {


            //TODO: JEZELI KOLEJKA JEST PUSTA TO
            // FIRST I LAST WSKAZUJA
            // NA TEN SAM NOWY ELEMENT

            //TODO: WIECEJ ELEMENTOW
            //PIERWSZY ZOSTAJE BEZ ZMIAN, DRUGI JEST OSTATNIM

            if (this.firstElement == null) {
                this.firstElement = myNode;
                this.lastElement = myNode;
            } else {
                myNode.setNextElemnt(this.lastElement);
                this.lastElement = myNode;
            }



    }


    @Override
    public MyNode dequeue() {



            MyNode temporary = this.lastElement;
            while (temporary.getNextElemnt() != firstElement) {
                temporary = temporary.getNextElemnt();
            }
            firstElement = temporary;
            temporary.setNextElemnt(null);


      //  lastElement = lastElement.getNextElemnt();

        return temporary.getNextElemnt();
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public String returnCollectionAsString() {
        return null;
    }
}
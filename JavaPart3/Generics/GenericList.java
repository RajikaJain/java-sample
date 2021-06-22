package JavaPart3.Generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{















// CONSTRAINTS
// T extends Number IN CLASS DEFINATION public class GenericList<T extends Comparable & Cloneable>
//T extends Comparable - implement class that can compare with each other, to compare two objects
//T extends Cloneable - if you want to copy a class we should use cloneable 







    
    // //GENERIC CLASSES, Java part 3 ->iteratable framework
    private T[] items = (T[]) new Object[10];
    private int count;
    
    public void add(T item){
            items[count++] = item;
        }
        public T get(int index){
            return items[index];
        }
        @Override
        public Iterator<T> iterator() {
            
            return new ListIterator(this);
        }


        
    private class ListIterator implements Iterator<T>{
        private GenericList<T> list;
        private int index;
        public ListIterator(GenericList<T> list) {
            this.list = list;
        }
        @Override
        public boolean hasNext() {
            
            return (index<list.count);
        }

        @Override
        public T next() {
            
            return list.items[index++];
        }
        
    }
    
}

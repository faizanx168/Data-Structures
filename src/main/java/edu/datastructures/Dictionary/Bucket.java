package edu.datastructures.Dictionary;


import edu.datastructures.singlylinkedlist.SinglyLinkedList;
import edu.learning.datatructure.java17.facade.AbstractDataType;
import edu.learning.datatructure.java17.facade.IModelEntry;

public class Bucket <K,V>{
    private int size = 0;
    private AbstractDataType<IModelEntry<K,V>> entires = new SinglyLinkedList<>();
    public void addEntries(IModelEntry<K,V> modelEntry){
        entires.add(modelEntry);
    }

    public AbstractDataType<IModelEntry<K,V>> getEntires(){
        return entires;
    }
    public void removeEntry(IModelEntry<K,V> entry){
        this.entires.remove(entry);
    }

    @Override
    public String toString() {
        return "Bucket{" +
                "size=" + size +
                ", entires=" + entires +
                '}';
    }
    //    public IModelEntry<K,V> get(K key){
////        list.filter();
//        return null;
//    }
}

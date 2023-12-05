package edu.datastructures.Dictionary;

import edu.learning.datatructure.java17.facade.IDictionary;
import edu.learning.datatructure.java17.facade.IModelEntry;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import edu.learning.datatructure.java17.custom.model.KeyAndValue;
public class CustomDictionary<K,V> implements IDictionary<K,V> {

    private IModelEntry<K,V>[] hashTable;
    private Bucket<K,V>[] hashTable2;
    private int size;
    private int collisionCount;
    private BiConsumer<Integer, IModelEntry<K, V>> biConsumer   ;

    public CustomDictionary(IntFunction<IModelEntry<K,V>[]> intFunction){
         hashTable=intFunction.apply(10);
         this.hashTable2 = new Bucket[10];
    }
    public CustomDictionary(IntFunction<IModelEntry<K,V>[]> intFunction,int size){
        hashTable=intFunction.apply(size);
        this.hashTable2 = new Bucket[size];
    }
    private int getIndexPosition(K key){
        int hashCode = Math.abs(key.hashCode());
        int indexPosition = hashCode % hashTable.length;
        return indexPosition;
    }
    @Override
    public void put(IModelEntry<K, V> entry) {
        int indexPosition = getIndexPosition(entry.getKey());
        if(this.hashTable2[indexPosition] == null) {
            hashTable2[indexPosition]= new Bucket<>();
        }
        this.hashTable2[indexPosition].addEntries(entry);
            if(this.hashTable[indexPosition] != null){
            this.collisionCount++;
            if (biConsumer!=null);
            biConsumer.accept(indexPosition,entry);
        }else {
            this.hashTable[indexPosition]=entry;
        }
        this.size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void collisionEvent(BiConsumer<Integer, IModelEntry<K, V>> biConsumer) {
        this.biConsumer = biConsumer;
    }

    @Override
    public void put(IModelEntry<K, V>... values) {
        IDictionary.super.put(values);
    }

    @Override
    public Optional<V> get(K key) {
        int indexPosition = this.getIndexPosition(key);
        Bucket<K,V> bucket= this.hashTable2[indexPosition];
        IModelEntry<K,V> keyLookup = new KeyAndValue<>(key);
        var modelEntry = bucket.getEntires().findFirst(keyLookup);
        if (modelEntry.isEmpty()){
            return Optional.empty();
        }else{
            return Optional.of(modelEntry.get().getValue());
        }
    }

    @Override
    public void delete(K key) {
        IDictionary.super.delete(key);
    }

    @Override
    public void removeAll() {
        IDictionary.super.removeAll();
    }

    @Override
    public V[] toArray() {
        return IDictionary.super.toArray();
    }

    @Override
    public int getCollisionCount() {
        return IDictionary.super.getCollisionCount();
    }
}

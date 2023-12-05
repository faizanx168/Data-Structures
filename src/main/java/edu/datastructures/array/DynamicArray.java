package edu.datastructures.array;
import edu.learning.datatructure.java17.facade.AbstractList;
import edu.learning.datatructure.java17.facade.AbstractNode;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class DynamicArray<T> extends AbstractList<T> {
        public DynamicArray(IntFunction<T[]> intFunction){
            super.items = intFunction.apply(allocatedSize);
            super.intFunction = intFunction;
        }
        public DynamicArray(IntFunction<T[]> intFunction,int size){
            if(size <= 0){
                size = 10;
            }
            super.allocatedSize  = size;
            super.items = intFunction.apply(size) ;
            super.intFunction = intFunction;
        }
    @Override
    public boolean add(T items) {
            incrementSize();
            if(super.allocatedSize < size()){
                allocatedSize = allocatedSize*2==0?10:allocatedSize*2;
                super.items = ArrayUtilityHelper.allocateMoreData(super.intFunction,super.items,super.allocatedSize);
            }
            super.items[super.index++]=items;
            return    true;

    }
    @Override
    public Optional<T> get(int index) {
        Optional<T> optional = Optional.empty();
        if (size() > index)
            optional = Optional.of(items[index]);
        return optional;
    }
    @Override
    public T[] toArray() {
        T[] data = intFunction.apply(size());
        for (int i = 0; i < data.length; i++) {
            data[i] = super.items[i];
        }
        return data;
    }
    @Override
    public void removeAll() {
        this.items  = this.intFunction.apply(0);
        this.resetSize();
        this.allocatedSize =     this.index = 0;
    }
    @Override
    public String toString() {
        return ArrayUtilityHelper.toString(this.toArray());
    }

    @Override
    public T removeAt(int index) {
            if(super.index<=0)
                return null;
            T deleteItem = items[index];
            items = ArrayUtilityHelper.removeIndexes(super.intFunction,items,index);
            decrementSize();
            return deleteItem;
    }

    @Override
    public T removeFirst() {
        if(size() != 0){
            return removeAt(0);
        }
        return null;
    }

    @Override
    public T removeLast() {
        if(size()!= 0){
            return removeAt(items.length-1);
        }
        return null;
    }

    @Override
    public boolean remove(T data) {
        if(size()==0) return false;
        for (int i =0; i < items.length;i++){
            if(items[i].equals(data)){
                removeAt(i);
                return true;
            }
        }
        return false;
    }
    public void max(BiConsumer<Integer, T> consumer) {
        int length = items.length;
        T maxValue = items[0];
        String maxString = null;
        T value = null;
        T value2 = null;
        int i = 0;

        for (; i < length; i++) {
            value = super.items[i];

            if (value instanceof Number) {
                Number number = (Number) value;
                if (number != null) {
                    double doubleValue = number.doubleValue();

                    if (maxValue == null || doubleValue >= ((Number) maxValue).doubleValue()) {
                        maxValue = (T) number;
                        value2 = items[i];
                    }
                }
            } else if (value instanceof String) {
                if (maxString == null || ((String) value).compareTo(maxString) > 0) {
                    maxString = (String) value;
                    value2 = items[i];
                }
            }
        }

        consumer.accept(i, value2);
    }
    public void min(BiConsumer<Integer, T> consumer) {
        int length = items.length;
        T minValue = items[0];
        String minString = null;
        T value = null;
        T value2 = null;
        int i = 0;

        for (; i < length; i++) {
            value = super.items[i];

            if (value instanceof Number) {
                Number number = (Number) value;
                if (number != null) {
                    double doubleValue = number.doubleValue();

                    if (minValue == null || doubleValue <= ((Number) minValue).doubleValue()) {
                        minValue = (T) number;
                        value2 = items[i];
                    }
                }
            } else if (value instanceof String) {
                if (minString == null || ((String) value).compareTo(minString) < 0) {
                    minString = (String) value;
                    value2 = items[i];
                }
            }
        }

        consumer.accept(i, value2);
    }

    @Override
    public void filter(Predicate<T> predicate, Consumer<T> consumer) {
            int i = 0;
        T current = items[i];
        while (current!=null){
            boolean istrue = predicate.test(current);
            if(istrue)
                consumer.accept(current);
            current = items[++i];
        }
    }
}

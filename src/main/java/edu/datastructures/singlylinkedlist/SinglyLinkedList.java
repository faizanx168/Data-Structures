package edu.datastructures.singlylinkedlist;

import edu.learning.datatructure.java17.custom.model.CompareT;
import edu.learning.datatructure.java17.facade.AbstractLinkedList;
import edu.learning.datatructure.java17.facade.AbstractNode;

import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

public class SinglyLinkedList<T> extends AbstractLinkedList<T> {
    private AbstractNode<T> first;

    private AbstractNode<T> last;
    public SinglyLinkedList(IntFunction<T[]> intFunction){
        super.intFunction = intFunction;
        super.items  = intFunction.apply(0);
    }
    public SinglyLinkedList(){}

    @Override
    public boolean add(T item) {
        incrementSize();
        var node = new Node<T>(item);
        if(AbstractNode.isEmpty(first)){
            first = last= node;
        }else {
            last.setNext(node);//this sets the last item
            last= node;//It makes the new tail
        }
        return true;
    }

    @Override
    public Optional<T> getFirstItem() {
        if(AbstractNode.isEmpty(first)){
            return Optional.empty();
        }else {
            T value = first.getValue();
            return Optional.of(value);
        }
    }

    @Override
    protected AbstractNode<T> getFirstNode() {
        return first;
    }

    @Override
    public Optional<T> getLastItem() {
        if(AbstractNode.isEmpty(last)){
            return Optional.empty();
        }else {
            T value = last.getValue();
            return Optional.of(value);
        }
    }

    @Override
    public T removeFirst() {
        if(AbstractNode.isEmpty(first))
            throw new NoSuchElementException("No More data, size is: "+this.size());
        super.decrementSize();
        if(this.first == this.last){
            first = last =null;
            return null;

        }
        AbstractNode<T> secondNode = this.first.getNext();
        first.setNext(null);
        first= secondNode;
        return first.getValue();
    }

    @Override
    public T removeLast() {
        if(AbstractNode.isEmpty(first))
            throw new NoSuchElementException("No More data, size is: "+this.size());
        super.decrementSize();
        if(first == last){
            first = last = null;
            return null;
        }

       AbstractNode<T> nextToLastNode = this.getPreviousNode(this.first,this.last);
       T value = last.getValue();
       last = nextToLastNode;
       last.setNext(null);
       return value;
    }
    private AbstractNode<T> getPreviousNode(AbstractNode<T> first, AbstractNode<T> node){
        AbstractNode<T> current = first;
    while (current!=null){
        if(current.getNext()==node)
            return current;
        current = current.getNext();

    }
        return null;
    }

    @Override
    public void removeAll() {
        first = null;
        last = null;
        resetSize();
    }
    private  int operationCount;
    @Override
    public void filter(Predicate<T> predicate, Consumer<T> consumer) {
        operationCount = 0;
        AbstractNode<T> current = first;
        while (current!=null){
            operationCount++;
            boolean istrue = predicate.test(current.getValue());
            if(istrue)
                consumer.accept(current.getValue());

            current = current.getNext();
        }
    }

    @Override
    public Optional<T> findFirst(T value) {
        operationCount = 0;
        AbstractNode<T> current=  first;
        while (current !=null) {
            operationCount++;
            T t2 = current.getValue();
            boolean isTrue = CompareT.isEqualTo(value, t2);
            if (isTrue) {
                return Optional.of(current.getValue());
            }
            current = current.getNext();
        }
        return Optional.empty();
        }

    @Override
    public long getOperationCount() {
        return super.getOperationCount();
    }
}

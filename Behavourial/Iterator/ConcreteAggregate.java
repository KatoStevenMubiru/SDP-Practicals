package Behavourial.Iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate{
    private List<Integer> items = new ArrayList<>();

    public void add(Integer item){
        items.add(item);
    }

    @Override
    public Iterator<Integer> createIterator(){

        return new ConcreteIterator(this);

    }

    public int size(){
        return items.size();
    }
    public Integer get(int index){
        return items.get(index);
    }
}

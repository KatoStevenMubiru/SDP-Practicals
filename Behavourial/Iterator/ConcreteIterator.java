package Behavourial.Iterator;

public class ConcreteIterator implements Iterator<Integer> {
    private ConcreteAggregate aggregate;
    private int currentIndex = 0;

    public ConcreteIterator(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < aggregate.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return aggregate.get(currentIndex++);
    }
}
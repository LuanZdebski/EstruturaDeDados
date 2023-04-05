public interface IDuplaEncadeada<T> {
    
    public int size();
    public boolean isEmpty();
    public DoubleNode<T> getFirst();
    public DoubleNode<T> getLast();
    public DoubleNode<T> getPrev(DoubleNode<T> n);
    public DoubleNode<T> getNext(DoubleNode<T> n);
    public void addBefore(DoubleNode<T> n, DoubleNode<T> n2);
    public void addAfter(DoubleNode<T> n, DoubleNode<T> n2);
    public void addFirst(DoubleNode<T> n);
    public void addLast(DoubleNode<T> n);
    public void remove(DoubleNode<T> n);

}

public class DoubleNode<T> {
    
    protected T valor;
    protected DoubleNode<T> next, prev;

    //contrutores
    DoubleNode(){this.valor = null; this.next = null; this.prev = null;}
    DoubleNode(T v, DoubleNode<T> n, DoubleNode<T> p){this.valor = v; this.next = n; this.prev = p;}

    //getters and setters

    public T getValor(){return this.valor;}
    public DoubleNode<T> getNext(){return this.next;}
    public DoubleNode<T> getPrev(){return this.prev;}
    public void setValor(T v){this.valor = v;}
    public void setNext(DoubleNode<T> n){this.next = n;}
    public void setPrev(DoubleNode<T> p){this.prev = p;}


}

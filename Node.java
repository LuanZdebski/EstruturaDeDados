public class Node<T> {
    private T valor;
    private Node<T> pointer; 

    public Node(T valorPassado)
    {
        this.valor = valorPassado;
        this.pointer = null;
    }
    public Node(T valorPassado, Node<T> pointerPassado)
    {
        this.valor = valorPassado;
        this.pointer = pointerPassado;
    }

    // getters and setters
    public T getValor() 
    {
        return valor;
    }
    public Node<T> getPointer() 
    {
        return pointer;
    }
    public void setValor(T novoValor) 
    {
        valor = novoValor;
    }
    public void setPointer(Node<T> novoPoint) 
    {
        pointer = novoPoint;
    }
    
}

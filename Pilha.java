public class Pilha<E> implements IPilha<E> {

    protected int capacity;
    public static final int CAPACITY = 1000;
    protected E array[];
    protected int top = -1; 

    //contrutores
    public Pilha() {
        this(CAPACITY); // default capacity
    }
    public Pilha(int cap) {
        capacity = cap;
        array = (E[]) new Object[capacity];
    }
        
    public int size()
    {
        return top + 1;
    }
    public boolean isEmpty()
    {
        boolean estaVazio = (top < 0);
        return estaVazio;
    }
    public E top()
    {
        return array[top];
    }
    public void push(E objeto)
    {
        //inserir objeto na pilha
        array[top + 1] = objeto;
        //acrecentar valor de top
        top++;
    }
    public E pop()
    {
        //pegar valor do topo da pilha
        E objeto;
        objeto = array[top];
        //deletar da pilha
        array[top] = null;
        //decrecer top
        top--;
        //devolver objeto tirado para função que chamou
        return objeto;
    }

    public String toString() {
        String s;
        s = "[";
        if (size() > 0) s+= array[0];
        if (size() > 1)
        {
        for (int i = 1; i <= size()-1; i++) 
            {
                s += ", " + array[i];
            }
        }
        return s + "]";
        }
        
    
}

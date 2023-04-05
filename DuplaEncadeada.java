public class DuplaEncadeada<T> implements IDuplaEncadeada<T> {

    protected int size;
    protected DoubleNode<T> head, tail;

    //construtores
    public DuplaEncadeada()
    {
        this.size = 0;
        head = new DoubleNode<T>(null, null, null);
        tail = new DoubleNode<T>(null, head, null);
        head.setNext(tail);
    }
    
    public int size() 
    {
        return this.size;
    }

    public boolean isEmpty() 
    {
        Boolean state = size == 0;
        return state;
    }

    public DoubleNode<T> getFirst() 
    {
        if(!isEmpty())
        {
            return head.getNext();
        }
        else{System.out.print("O retorno foi nulo pois a lista esta vazia"); return null;}
    }

    public DoubleNode<T> getLast() 
    {
        if(!isEmpty())
        {
            return tail.getPrev();
        }
        else{System.out.print("O retorno foi nulo pois a lista esta vazia"); return null;}
    }

    public DoubleNode<T> getPrev(DoubleNode<T> n) 
    {
        //primeiro conferir se o node passado não é igual a head
        if(n != head)
        {
            return n.getPrev();
        }
        //caso seja
        else{System.out.print("O retorno foi nulo pois não se pode obter elementos previos de head"); return null;}
    }

    public DoubleNode<T> getNext(DoubleNode<T> n) 
    {
        //primeiro conferir se o node passado não é igual a tail
        if(n != tail)
        {
            return n.getNext();
        }
        //caso seja
        else{System.out.print("O retorno foi nulo pois não se pode obter elementos adjacentes de tail"); return null;}
    }

    public void addBefore(DoubleNode<T> beforeThis, DoubleNode<T> toAdd) 
    {
        //pega o node que vem antes de "beforeThis" e guarda em um auxiliar
        DoubleNode<T> aux = getPrev(beforeThis); 
        //configura os apontamentos do novo node: (aux) <- (toAdd) -> (beforeThis)
        toAdd.setPrev(aux);
        toAdd.setNext(beforeThis);
        //configura o apontamento de beforeThis: (toAdd) <- (beforeThis) 
        beforeThis.setPrev(toAdd);
        //configura o apontamento de aux: (aux) -> (toAdd)
        aux.setNext(toAdd);
        size++;
    }

    public void addAfter(DoubleNode<T> afterThis, DoubleNode<T> toAdd) 
    {
        //pega o node que vem depois de "afterThis" e guarda em um auxiliar
        DoubleNode<T> aux = getNext(afterThis); 
        //configura os apontamentos do novo node: (afterThis) <- (toAdd) -> (aux)
        toAdd.setPrev(afterThis);
        toAdd.setNext(aux);
        //configura o apontamento de afterThis: (afterThis) -> (toAdd) 
        afterThis.setNext(toAdd);
        //configura o apontamento de aux: (toAdd) <- (aux)
        aux.setPrev(toAdd);
        size++;
    }

    public void addFirst(DoubleNode<T> n) 
    {
        //Adciona um node ja sabendo que o que antecede é head: (Head) <-> (novo)
        addAfter(head, n);
    }

    public void addLast(DoubleNode<T> n) 
    {
        //Adciona um node ja sabendo que o que proximo é tail: (novo) <-> (Tail)
        addBefore(tail, n);
    }

    public void remove(DoubleNode<T> toRemove) 
    {
        //Primeiro pegamos as referencias dos 2 nodes adjacentes para "fechar o espaço" depois
        DoubleNode<T> before = getPrev(toRemove);
        DoubleNode<T> after = getNext(toRemove);
        //(before) <-> (toRemove) <-> (after)
        //fechamos o espaço linkando before com after
        before.setNext(after);
        after.setPrev(before);
        //(before) <-> (after)
        //anula as referencias para o toRemove e diminui o tamanho da lista
        toRemove.setNext(null);
        toRemove.setPrev(null);
        size--;
    }
    @Override
    public String toString() {
     String r = "";
     DoubleNode<T> n = this.getFirst();
     String s = (String)n.getValor();
     r = s + "\n";


     while (n != this.tail) {
       n = n.getNext();
       if ( n.getValor() != null) {
         r = r + (String) n.getValor();
         r += "\n";
       }
    }
    return r;
  }
    
}

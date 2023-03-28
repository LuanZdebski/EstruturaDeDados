public class Encadeada<T> implements IEncadeada<T> {
    protected Node<T> head;
    protected int size;

    public Encadeada()
    {
        head = null;
        size = 0;
    }

    public void addNode(T valor) {
        Node<T> novoNode = new Node<T>(valor);
        novoNode.setPointer(this.head);
        this.head = novoNode;
        this.size++;
    }

    public void removeNode() {
        Node<T> newPointer = this.head.getPointer();
        this.head = newPointer;
        this.size--;
    }

    public void clearEncadeada() {
        while(size > 0)
        {
            this.removeNode();
        }
    }
    @Override
    public String toString() {
        String text;
        text = "Head: " + this.head;
        text += " Size: " + this.size + "\n";
        text += "Valores: (";
        Node<T> nodeAtual = this.head;
        for (int i = 0; i < this.size; i++)
        {
            if(i == this.size - 1){text += nodeAtual.getValor() + ")\n";}
            else{text += nodeAtual.getValor() + ", ";}
            nodeAtual = nodeAtual.getPointer();
        }
        return text;
    }   

}

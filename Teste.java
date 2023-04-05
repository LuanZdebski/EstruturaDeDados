public class Teste {

    
    public static void main(String[] args) {

        DuplaEncadeada<String> lista = new DuplaEncadeada<String>();
        
        // add valores na lista encadeada
        DoubleNode<String> manyNode = new DoubleNode<>("many", null, null);
        lista.addFirst(manyNode);

        DoubleNode<String> newNode = new DoubleNode<>("qualquer", null, null);
        lista.addLast(newNode);

        newNode = new DoubleNode<>("depois porem em primeiro", null, null);
        lista.addFirst(newNode);

        newNode = new DoubleNode<>("adicione-me depois de many", null, null);
        lista.addAfter(manyNode, newNode);

        newNode = new DoubleNode<>("adicione-me antes de many", null, null);
        lista.addBefore(manyNode, newNode);

        

        System.out.println(lista.toString());
        
        
    }
    
}

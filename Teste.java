public class Teste {

    
    public static void main(String[] args) {

        Encadeada<String> listaEncadeada = new Encadeada<String>();
        
        listaEncadeada.addNode("Maria");
        listaEncadeada.addNode("Antonio");
        listaEncadeada.addNode("UniBrasil");
        listaEncadeada.addNode("Marcos");
        listaEncadeada.addNode("Joao");
        listaEncadeada.addNode("Karine");
        listaEncadeada.addNode("Karina");
        listaEncadeada.addNode("Luis");
        listaEncadeada.addNode("Jose");
        listaEncadeada.addNode("Luan Matheus Zdebski da Silva");
        System.out.print(listaEncadeada.toString());

        listaEncadeada.removeNode();
        System.out.print(listaEncadeada.toString());
        
        listaEncadeada.clearEncadeada();
        System.out.print(listaEncadeada.toString());

        
    }
    
}

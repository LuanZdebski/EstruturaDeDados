public class Teste {
    
    public static void main(String[] args) {

        Pilha<String> pilhaDeStrings = new Pilha<>();

        System.out.println("vazio:" + pilhaDeStrings.isEmpty());

        pilhaDeStrings.push("alguma coisa");
        pilhaDeStrings.push("Outra coisa");

        System.out.println("vazio:" + pilhaDeStrings.isEmpty());
        System.out.println("tamanho:" + pilhaDeStrings.size());
        System.out.println(pilhaDeStrings.toString());

        System.out.println("Aqui tiramos o valor do topo que eh:" + pilhaDeStrings.pop());

        System.out.println(pilhaDeStrings.toString());
    }
    
}

public class Teste {

    
    public static void main(String[] args) {

        int[] vetor = {4, 60, 22, 1, 20};
        Ordenation ord = new Ordenation();

        ord.PorSelecao(vetor);

        for (int i : vetor) {
            System.out.println(i);
        }

        System.out.println(BinarySearch.Search(22, vetor));
                
        
    }
    
}

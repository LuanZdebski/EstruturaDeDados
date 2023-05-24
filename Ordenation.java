

public class Ordenation {


    //Ordenação por trocas
    public void PorTrocas(int[] vetorAntigo)
    {
        int size = vetorAntigo.length;
        for(int i = 0; i < size-1; i++ )
        {
            for(int j = 0; j < size-1; j++ )
            {
                if(vetorAntigo[j] > vetorAntigo[j + 1])
                {
                    int temp = vetorAntigo[j + 1];
                    vetorAntigo[j + 1] = vetorAntigo[j];
                    vetorAntigo[j] = temp;
                }
            }
        }

    }
    //Ordenação por seleção
    public int Seleciona(int[] vetor, int valor)
    {
        int i = 0;
        for(int j = 1; j < valor; j++ )
        {
            if(vetor[i] < vetor[j])
            {
                i = j;
            }
        }
        return i;
    }
    public void PorSelecao(int[] vetor)
    {
        int size = vetor.length;
        int i;
        int temp;
        while(size>1)
        {
            i = Seleciona(vetor, size);
            temp = vetor[size - 1];
            vetor[size - 1] = vetor[i];
            vetor[i] = temp;
            size--;
        }
    }
    
}

public class BinarySearch {
    
    public static int Search(int x, int[] vetor)
    {
        int p = 0;
        int size = vetor.length;
        int u = size - 1;

        int m = 0;
        while(p <= u)
        {
            m = p + u / 2;
            if(x == vetor[m])
            {
                return 1;
            }
            else
            {
                if(x < vetor[m])
                {
                    u = m - 1;
                }
                else
                {
                    p = m + 1;
                }
            }
        }

        return 0;
    }


}

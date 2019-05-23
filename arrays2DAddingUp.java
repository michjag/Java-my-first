package zadaniazestrony;

public class ZadaniaZeStrony
{
   int [][] tablica = { {1,2,3,4,5,6,7},
                        {1,2,3,4,5,6,7},
                        {1,2,3,4,5,6} };
    // int [][] drugaTablica = new int[3][6];
    //int [] jedenTab = new int [] {23,3,3,3};

    public ZadaniaZeStrony()
    {
    }

   
    public int metodka()
    {
        int suma = 0;

        for (int i = 0; i < tablica.length; i++) 
        {
            for (int j = 0; j < tablica[i].length; j++) 
            {
            suma += tablica[i][j];    
            }
        }
 
        return suma;
    }

    public static void main(String[] args) 
    {
        ZadaniaZeStrony noweZadanie = new ZadaniaZeStrony();
        int wyswietl = noweZadanie.metodka();  
        System.out.println(wyswietl);
    } 
}



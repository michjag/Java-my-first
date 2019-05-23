package zadaniazestrony;

public class ZadaniaZeStrony
{
    int [] tablica = new int []{5,8,66, 34, 104, -5, 5,6,77};
    
    public ZadaniaZeStrony()
    {
    }

    public int metodka(int wynik)
    {
       wynik = tablica[0];
       
       for (int i = 1; i < tablica.length; i++)
       {
           if (wynik < tablica[i]) //minimalny zamiana znaku "<"  na ">"
           {
               wynik = tablica[i];
           }
       }
        return wynik;
    }

    public static void main(String[] args) 
    {
        ZadaniaZeStrony noweZadanie = new ZadaniaZeStrony();
        int wypisanie = noweZadanie.metodka(0);
        System.out.println("Największy wynik to: " + wypisanie);
    } 
}



package zadaniazestrony;

import java.util.Scanner;

public class ZadaniaZeStrony
{
    public ZadaniaZeStrony()
    {
    }

    public void zamianaLiczbyCalkowitejNaBinarna()
    {
        Scanner inputScanner = new Scanner(System.in);
        int liczbaCalkowita = 0;
        int nowaLiczbaCalkowita;
        String rezultat = "";
        
        for(;;)
        {
            System.out.println("Podaj liczbę całkowitą: (Aby zakończyć podaj 1)");
            liczbaCalkowita = inputScanner.nextInt();

            while(liczbaCalkowita > 0)
            {
                rezultat += liczbaCalkowita % 2;
                liczbaCalkowita /= 2;
            }   
                        
            String rezultatOstateczny = new StringBuilder(rezultat).reverse().toString();
            System.out.println("W systemie binarnym: " + rezultatOstateczny);
            
            if(rezultatOstateczny.equalsIgnoreCase("1"))
                break;
            
            rezultat = "";
        }
        
    }

    public static void main(String[] args) 
    {
        ZadaniaZeStrony noweZadanie = new ZadaniaZeStrony();
        noweZadanie.zamianaLiczbyCalkowitejNaBinarna();
    } 
}



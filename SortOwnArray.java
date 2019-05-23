package zadaniazestrony;

import java.util.Arrays;
import java.util.Scanner;

public class ZadaniaZeStrony
{
    public ZadaniaZeStrony()
    {
    }

    int dlugoscTablicy;
    double [] tablicaDoSortowania;
    
    public void sortowanieTablicy()
    {
        System.out.println("Podaj długość tablicy: ");
        
        Scanner inputScanner = new Scanner(System.in);
        dlugoscTablicy = inputScanner.nextInt();
        
        tablicaDoSortowania = new double[dlugoscTablicy];
        
        System.out.println("Podaj " + dlugoscTablicy + " liczb do posortowania");
        
        for(int i = 0; i < tablicaDoSortowania.length; i++)
        {
            tablicaDoSortowania[i] = inputScanner.nextDouble();
        }
        
        System.out.println("");
        //mechanizmSortowania(tablicaDoSortowania);
        Arrays.sort(tablicaDoSortowania, 0, dlugoscTablicy);
        
        for (double wyswietlTablicePosortowana : tablicaDoSortowania)
            System.out.print(wyswietlTablicePosortowana + " ");
        
        System.out.println("");
      
        double [] kopiaTablicy = Arrays.copyOf(tablicaDoSortowania, dlugoscTablicy);
        
        System.out.println("Od tyłu: ");
        
        for (int i = dlugoscTablicy - 1; i >= 0; i-- )
            System.out.print(kopiaTablicy[i] + " ");
    }

    public double[] mechanizmSortowania(double [] przeslanaTablica)
    {
        System.out.println("Liczby posortowane: ");
        for (int i = 0; i < przeslanaTablica.length; i++)
        {
            for (int j = 0; j < przeslanaTablica.length - 1; j++)
            {
                if (przeslanaTablica[j] > przeslanaTablica[j + 1])
                {
                    double temp;
                    temp = przeslanaTablica[j + 1];
                    przeslanaTablica[j + 1] = przeslanaTablica[j];
                    przeslanaTablica[j] = temp;
                }
            }
        }
        
        return przeslanaTablica;
    }

    public static void main(String[] args) 
    {
        ZadaniaZeStrony noweZadanie = new ZadaniaZeStrony();
        noweZadanie.sortowanieTablicy();
    } 
}



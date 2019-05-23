package zadaniazestrony;

import java.util.Arrays;
import java.util.Scanner;

public class ZadaniaZeStrony
{
    Scanner inputScanner = new Scanner(System.in);
    String wprowadz = "";
    
    public ZadaniaZeStrony()
    {
    }

    public void lancuchZnakow()
    {
        System.out.println("Podaj łańcuch znaków");
        wprowadz = inputScanner.nextLine();
        
        System.out.println("Długość łańcucha: " + wprowadz.length());
        System.out.println("Czy jest palidromem: " + new StringBuilder(wprowadz).reverse().toString().equalsIgnoreCase(wprowadz));
        System.out.println("Łańcuch od tyłu: " + new StringBuilder(wprowadz).reverse());
    }

    public static void main(String[] args) 
    {
        ZadaniaZeStrony noweZadanie = new ZadaniaZeStrony();
        noweZadanie.lancuchZnakow();
    } 
}



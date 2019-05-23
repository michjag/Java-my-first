package zadaniazestrony;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZadaniaZeStrony 
        
{
    public ZadaniaZeStrony()
    {
    }

    public void metodka()
    {
        Scanner inputScanner = new Scanner(System.in);
        double liczbaDoPierwiastka;
        
        System.out.println("Podaj liczbę");
            
        while(true)
        {
            try 
            {
               liczbaDoPierwiastka = inputScanner.nextDouble();
               break;
            } 

            catch (InputMismatchException e) 
            {
                System.out.println("Podaj poprawną liczbę");
                inputScanner.next();
            }
        }

        if (liczbaDoPierwiastka < 0)
        {
            throw new IllegalArgumentException("Number must be > 0 " + liczbaDoPierwiastka);
        }

        liczbaDoPierwiastka = Math.sqrt(liczbaDoPierwiastka);
        System.out.println("Liczba po pierwiastkowaniu: " + liczbaDoPierwiastka);
    }
    
    public static void main(String[] args) 
    {
        ZadaniaZeStrony noweZadanie = new ZadaniaZeStrony();
         noweZadanie.metodka();  
    } 

}



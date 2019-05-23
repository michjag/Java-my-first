package zadaniazestrony;

import java.util.Scanner;

public class ZadaniaZeStrony
{

    public static void main(String[] args) 
    {

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Podaj liczbę przedmiotów: ");
        int numberOfClasses = inputScanner.nextInt();
        System.out.println("Podaj liczbę ocen z każdego przedmiotu: ");
        int numberOfNotes = inputScanner.nextInt();

        double [][] sredniaOcen = new double[numberOfClasses][numberOfNotes];

        for (int classIndex = 0; classIndex < numberOfClasses; classIndex++)
        {
            for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++)
            {
                System.out.println("Wprowadź ocenę przedmiot: " + (classIndex + 1) + " ocena: " + (noteIndex + 1));
                sredniaOcen[classIndex][noteIndex] = inputScanner.nextDouble();
            }
        }

        double [] suma = new double[numberOfClasses];
        double wynik = 0; 

         for (int classIndex = 0; classIndex < numberOfClasses; classIndex++)
         {
             for (int noteIndex = 0; noteIndex < numberOfNotes; noteIndex++)
             {
                 suma[classIndex] += sredniaOcen[classIndex][noteIndex];
             }
         }

        int numerPrzedmiotu = 1;

        for(double obliczSrednia : suma)
        {
            wynik = obliczSrednia / numberOfNotes;
            System.out.println("Przedmiot numer: " + numerPrzedmiotu++ + " " + wynik + " ");
        }

    } 
}



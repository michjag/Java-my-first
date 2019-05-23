package zadaniazestrony;

import java.util.InputMismatchException;

public class ZadaniaZeStrony 
        
{
    public ZadaniaZeStrony()
    {
    }

    public void metodka()
    {
        long zapitalaj = 99999932223234545L;
        long [] tablica = new long[999999999];
        
        int i = 0;
        while(true)
        {
            tablica[i] = zapitalaj * zapitalaj;
            i++;
        }
    }
    
    public static void main(String[] args) 
    {
        ZadaniaZeStrony noweZadanie = new ZadaniaZeStrony();
         noweZadanie.metodka();  
    } 

}



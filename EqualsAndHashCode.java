package zadaniazestrony;

import java.util.Objects;


public class ZadaniaZeStrony 
        
{
        String name;
        int age;
        int weight;
        
    public ZadaniaZeStrony(String name, int age, int weight)
    {
           this.name = name;
            this.age = age;
            this.weight = weight;
    }

        @Override
        public boolean equals(Object obj)
        {
            if (obj == null)
                return false;
            
            if(obj instanceof ZadaniaZeStrony)
            {
                ZadaniaZeStrony otherHuman = (ZadaniaZeStrony) obj;
                return name.equals(otherHuman.name) &&
                        (age == otherHuman.age) && 
                        (weight == otherHuman.weight);
            }
            
            return false;
        }

        @Override
        public int hashCode() 
        {
            int hash = 7;
            hash = 17 * hash + Objects.hashCode(this.name);
            hash = 17 * hash + this.age;
            hash = 17 * hash + this.weight;
            return hash;
        }

    public static void main(String[] args) 
    {
       ZadaniaZeStrony ludekJeden = new ZadaniaZeStrony("Zenon", 40, 80);
       ZadaniaZeStrony ludekDrugi = new ZadaniaZeStrony("Zenon", 40, 80);
       ZadaniaZeStrony ludekTrzeci = new ZadaniaZeStrony("Janek", 23, 44);
       
       System.out.println(ludekJeden.equals(ludekDrugi));
       System.out.println(ludekDrugi.equals(ludekTrzeci));
    } 

}



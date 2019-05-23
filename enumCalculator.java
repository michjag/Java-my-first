package zadaniazestrony;

public class ZadaniaZeStrony 
{
    enum Computation 
    {
        MULTIPLY, 
        DIVIDE, 
        ADD, 
        SUBTRACT;
    
        public double perform(double x, double y)
        {
            switch (this)
            {
                case MULTIPLY:
                    return x * y;
                case DIVIDE:
                    return x / y;
                case ADD:
                    return x + y;
                case SUBTRACT:
                    return x - y;
            }
            return 0;
        }
    }

    public static void main(String[] args) 
    {
         System.out.println(Computation.MULTIPLY.perform(4, 2));
         System.out.println(Computation.DIVIDE.perform(4, 2));
         System.out.println(Computation.ADD.perform(4, 2));
         System.out.println(Computation.SUBTRACT.perform(4, 2));
    } 
}



package LambdaExp;

interface LambdawithException {
    void divide(int x, int y);
}
interface ArrayIndex {
    void set(String x, int a);
}
public class LambdawithExcep  {
    public static void main(String[] args) throws ArithmeticException, ArrayIndexOutOfBoundsException{
        LambdawithException excap1 = (int x, int y)->{
            try {
                System.out.println("Division is:" + (x / y));
            }
            catch(Exception e)
            {
                System.out.println("Can't divide by zero...");
            }
        };
        ArrayIndex arr = (String x, int y)->
        {
            try
            {
                System.out.println("Character at position is: "+x.charAt(y));
            }
            catch(Exception e)
            {
                System.out.println("Array Index out of bound...");
            }
        };
    excap1.divide(10,0);
    arr.set("Java",3);
    }
}

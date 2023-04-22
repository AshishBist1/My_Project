public class MyProgress {
    public static void main(String[] args)  {
        int x = 10;
        int y = 0;
         //This line will cause an error
        try{
            System.out.println(x / y); // Throws an Exception
        }
        catch (ArithmeticException e){
            System.out.println("Division By Zero is Not Allowed");
        }

    } 
}
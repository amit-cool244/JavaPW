public class TypeCasting 
{
    public static void main(String[] args)
     {
        /* 
        int a = 45;
        double b;
        b = a;  // implicit type casting
        System.out.println(b);
        */

        /* 
        double num1 = 45.5;
        int num2;
        num2=(int) num1;
        System.out.println(num2);
        */
        
        /* 
        float n1 = 12;
        float n2 = 5;
        float res = n1/n2;
        System.out.println(res);
        */

        int n1 = 12;
        int n2 = 5;
        float res = n1/n2;
        System.out.println(res); // Whenever we divide two integer values we get output in interger even though you are storing the output 
                                //  in float data type and the value after decimal will be truncated or rounded to zero
                                // Here the output will be "2.0" instead of "2.4" as the value ".4" is truncated
     }
}   
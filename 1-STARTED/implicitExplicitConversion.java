import java.util.*;
public class implicitExplicitConversion{
    public static void main(String[] args) {
        short num1 = 89;
        int num2 = num1;
        //System.out.println(num2);
        long num3 = 8348735231L;
        int num4 = (int)num3;
        //System.out.println(num4);
        char letter = 'a';
        char convert = (char)(letter+2);
        System.out.println(convert);
    }
}

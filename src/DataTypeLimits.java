import java.util.*;
public class DataTypeLimits {
    public static void main(String[] args){
        Scanner masih=new Scanner(System.in);
        boolean tr = masih.hasNextByte() || masih.hasNextInt() || masih.hasNextLong() || masih.hasNextShort();
        if(tr){
            long num = masih.nextLong();
            System.out.println(num +" can be fitted in:");
            if(num >= Byte.MIN_VALUE&&num <= Byte.MAX_VALUE) {
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(num >= Short.MIN_VALUE&&num <= Short.MAX_VALUE){
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            }
            else if(num >= Integer.MIN_VALUE&&num <= Integer.MAX_VALUE){
                System.out.println("* int");
                System.out.println("* long");
            }
            else System.out.println("* long");
        }
        else {
            String error = masih.nextLine();
            System.out.println(error +" can't be fitted anywhere.");
        }
    }
}

import java.util.*;
public class noteOnScanners {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        int i = masih.nextInt();
        double d = masih.nextDouble();
        masih.nextLine();/*any scanner that reads a number leaves a white space for the next string scanner
        so this takes the white space and allows the next one to read the actual input*/
        String s = masih.nextLine();



        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

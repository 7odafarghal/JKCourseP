import java.util.*;
public class ageCalculate {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        int age;
        System.out.print("Choose a number from 1-9: ");
        int num = masih.nextInt();
        num = (num*2+5)*50+1766;
        System.out.print("Subtract your year of birth from this number " + num +": ");
        age = masih.nextInt();
            for(int i=200;i<1100;i += 100) if (i > age){ age -= i - 100; break;}
        System.out.println("your age is: " + age);
    }
}

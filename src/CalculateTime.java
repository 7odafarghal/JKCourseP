import java.util.*;
public class CalculateTime {
    public static void main(String[] args){
        //works with ScndsPssd
        Scanner masih = new Scanner(System.in);
         int a=masih.nextInt();
         int b=masih.nextInt();
         int c=masih.nextInt();
         int x=masih.nextInt();
         int y=masih.nextInt();
         int z=masih.nextInt();
        System.out.println(((((x*60)+y)*60)+z)-((((a*60)+b)*60)+c));
    }
}

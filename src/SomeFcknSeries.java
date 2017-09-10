import java.util.*;
public class SomeFcknSeries {
    public static void main(String[] args){
        Scanner masih=new Scanner(System.in);
            int n=masih.nextInt();
            for (int k = 0; k < n; k++) {
                System.out.print(Number.seriesOfpPowers(2,k + 1));//adding one here because in that method there the num is already less than n by 1 so if we give it k which is less than n by 1 num would be less than n by 2
                System.out.print(" ");
            }
        System.out.println();

    }
}


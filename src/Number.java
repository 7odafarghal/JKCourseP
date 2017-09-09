import java.util.*;
public class Number {

    public static int power(int num,int pow){
        int numb =num;
        for (int i = 0; i <= pow; i++) {
            if(i==0){numb=1;continue;}
            numb = numb * num;
        }
        return numb;
    }

    //this series is(num^0+num^1..........+num^pow)
    public static int seriesOfPowers(int num ,int maxPow){
        int numb=num;
        int zwei=0;
        for (int i = 0; i < maxPow; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==0){numb=1;continue;}
                numb = numb * num;
            }
            System.out.print(numb+" ");
            zwei+=numb;
        }
        System.out.print("= ");
        if(maxPow==0) return 1;
        else if(maxPow<0)return 1/zwei;
        else return zwei;
    }
}

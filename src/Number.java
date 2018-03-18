public class Number {
    //positive powers
    public static int Power(int num,int pow){
        int numb = num;
        if(pow==0)numb = 1;
        else {
            for (int i = 0; i <= Math.abs(pow); i++) {
                if (i == 0) {
                    numb = 1;
                    continue;
                }
                numb = numb * num;
            }
        }
        return numb;
    }
    //negative powers
    public static double Power(int num,double pow){
        int numb =num;
        double numbd;
        for (int i = 0; i <= Math.abs(pow); i++) {
            if(i==0){numb=1;continue;}
            numb = numb * num;
        }
        if(pow<0){numbd=(double) 1/numb; return numbd;}
        else if(pow>0)return numb;
        else return 1;
    }

    //this series is(num^0+num^1..........+num^pow) takes only positive powers
    public static int seriesOfpPowers(int num ,int maxPow){
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
        else return zwei;
    }
}

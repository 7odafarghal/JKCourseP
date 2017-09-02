import java.util.*;
public class ScndsPssd {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        int scpsd = masih.nextInt();
        //setting the time
        int sec,min,hr;
        sec = scpsd%60;
        if(scpsd/60>59){
            min = (scpsd/60)%60;
            hr = (scpsd/60)/60;
            //for(int i=0;hr>23;i++)hr -= 24; //this will count the time passed from the last day only
        }
        else{
            min = scpsd/60;
            hr = 0;
        }
        //printing the time
        String sSec,sMin,sHr;
        if(sec<10)sSec =(":0"+sec);
        else sSec =(":"+sec);
        if(min<10)sMin =(":0"+min);
        else sMin =(":"+min);
        if(hr<10)sHr=("0"+hr);
        else sHr =Integer.toString(hr);
        System.out.println(sHr+sMin+sSec);
    }
}

import java.util.*;
public class ReplaceSpace {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        String flnm = masih.nextLine();
        char[] newfile = new char[flnm.length()];
        for(int i=0;i<flnm.length();i++){
            if(i+1<flnm.length())
                if(flnm.charAt(i)==' '&&flnm.charAt(i+1)==' ') continue;
                    if(flnm.charAt(i)==' ') newfile[i]='_';
                        else newfile[i]=flnm.charAt(i);
                System.out.print(newfile[i]);
        }
    }
}

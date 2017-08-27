import java.util.*;
public class WhnC {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        String[] family = new String[6];
        String name = "memeber";
        for(int i =0;i<family.length;i++){
            switch (i){
                case 0: name = "Father"; break;
                case 1: name = "Mother"; break;
                case 2: name = "Me"; break;
                case 3: name = "Sister 1"; break;
                case 4: name = "Sister 2"; break;
                case 5: name = "Brother"; break;
            }
            System.out.print("The " + name +" is: ");
            family[i] = masih.nextLine();
        }
        for(String member:family){
            System.out.println(member);
        }
    }

}
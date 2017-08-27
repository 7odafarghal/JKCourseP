import java.util.Scanner;
public class whenQueensCollide {
    public static void main(String[] arg){
        Scanner masih = new Scanner(System.in);
        System.out.print("x1:");
        int x1 = masih.nextInt();
        System.out.print("y1:");
        int y1 = masih.nextInt();
        System.out.print("x2:");
        int x2 = masih.nextInt();
        System.out.print("y2:");
        int y2 = masih.nextInt();
        //Queens rules
        if(x1==x2/*same row*/ || y1==y2/*same column*/
                || x1+y1==x2+y2/*same backward diagonal*/ || y1-x1==y2-x2/*same forward diagonal*/ )
            System.out.println("if Queens: collision");
        else System.out.println("if Queens: safe");
        //Rooks rules
        if(x1==x2/*same row*/ || y1==y2/*same column*/)
            System.out.println("if Rooks: collision");
        else System.out.println("if Rooks: safe");
        //Bishops  rules
        if(x1+y1==x2+y2/*same backward diagonal*/ || y1-x1==y2-x2/*same forward diagonal*/ )
        System.out.println("if Bishops: collision");
        else System.out.println("if Bishops: safe");
        //Knight rules

        //King rules

        //Pawn rules

    }
}

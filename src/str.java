import java.util.*;
public class str {
    public static void main(String[] args){
        Scanner msh = new Scanner(System.in);
        int rc = msh.nextInt();
        String[][] arRy = new String[rc][rc];
        //loop to select each row
        for(int i = 0; i<arRy.length;i++) {
            //loop to select each column
            for(int j = 0; j<arRy.length;j++){
                if(i==(/*middle row*/arRy.length-1)/2 || /*middle column*/j==(arRy.length-1)/2|| /*backward diagonal*/i==j || /*forward diagonal*/i+j==arRy.length-1)
                arRy[i][j] = "* ";
                else arRy[i][j] = ". ";
            }
        }
        for(int l=0;l<arRy.length;l++){
            for(int c=0;c<arRy.length;c++){
                System.out.print(arRy[l][c]);
            }
            System.out.println();
        }
        // better solution using while loop
        Scanner mash = new Scanner(System.in);
        int rb = mash.nextInt();
        String[][] arRry = new String[rb][rb];
        int q =0;
        //loop to select each row
        for(int i = 0; i<arRry.length;i++) {
            //loop to select each column
            while(q<arRry.length){
                if(/*middle row*/i==(arRry.length-1)/2 || /*middle column*/q==(arRry.length-1)/2 || /*backward diagonal*/i==q || /*forward diagonal*/i+q==arRry.length-1)
                    arRry[i][q] = "* ";
                else arRry[i][q] = ". ";
                System.out.print(arRry[i][q]);
                q++;
            }
            System.out.println();
            q=0;//to reset j value before entering the while loop again
        }
    }
}
import java.util.*;
public class multable {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        int a = masih.nextInt();
        int b = masih.nextInt();
        int collngth = b-a+1;
        int c = masih.nextInt();
        int d = masih.nextInt();
        int rowlngth = d-c+1;

        int[] col = new int[collngth];
        for(int i=0;i<col.length;i++){
            col[i] =a+i;
        }

        int[] row = new int[rowlngth];
        for(int i=0;i<row.length;i++){
            row[i] =c+i;
        }

        System.out.print(" \t");
        for(int i=0;i<row.length;i++)System.out.print(row[i]+"\t");
        System.out.println();

        for(int i=0;i<col.length;i++){
            System.out.print(col[i]+"\t");
            for(int j=0;j<row.length;j++){
                System.out.print(col[i]*row[j] +"\t");
            }
            System.out.println();
        }

    }
}

import java.util.Scanner;
public class HanoiTowerRecursive {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        System.out.print("Number of disks: ");
        int[] tbl={masih.nextInt(),1,2,3};
        System.out.println("The fastest possible solution is "+(Number.Power(2,tbl[0])-1)+" steps:");
        solution(tbl);
    }
    public static void solution(int[] num){
        int[] sol;
        if(num[0]==1) System.out.println(num[1] + "-" + num[3]);
        else{
            sol= new int[]{num[0] - 1, num[1], num[3], num[2]};
            solution(sol);
            sol= new int[]{1, num[1], num[2], num[3]};
            solution(sol);
            sol= new int[]{num[0] - 1, num[2], num[1], num[3]};
            solution(sol);
        }
    }
}
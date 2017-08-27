import java.util.*;
public class MultiDArr {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        String[][] food = new String[3][];
        food[0] = new String[3];// cucumber carrot tomato
        food[1] = new String[4];// pomegranate apple peach lemon
        food[2] = new String[4];// ketchup pepper salt hot sauce
        for(int row=0;row<food.length;row++){
            for(int col=0;col<food[row].length;col++){
                if(row==0)System.out.print("Name a vegetable: ");
                else if(row==1)System.out.print("Name a fruit: ");
                else if(row==2) System.out.print("Name a spice: ");
                food[row][col] = masih.next();
            }
            System.out.println();
        }
        for(int row=0;row<food.length;row++){
            for(int col=0;col<food[row].length;col++){
                System.out.print(food[row][col] + "\t");
            }
            System.out.println();
        }
    }
}

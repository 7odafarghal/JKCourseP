import java.util.*;
public class DNAEncodingAlgorithm {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        String string = masih.nextLine();
        int c =1;
        char[] code = new char[string.length()];
        for(int i=0;i<string.length();i++){
            if(i+1<string.length())//this will assign the last character in the string to the array immediately
                // but it's okay because with the continue statement in line 12 the program won't assign the character unless it's the last of it's copies
                // so if it's the last one of the copies that means there aren't any copies assigned before it
                // and if not it will be assigned any way and it will take number 1 because the int c doesn't change unless there are copies
                if(string.charAt(i) == string.charAt(i + 1)){
                    c++;
                    continue;//doesn't assign the character until it's the last copy
                }
            code[i] = string.charAt(i);
            System.out.print(code[i]+Integer.toString(c));
            c=1;
        }
    }
}

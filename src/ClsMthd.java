import java.util.*;

public class ClsMthd {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);

        Person megan = new Person("Megan Fox");
        megan.setAge(30);
        megan.setJob("Actor");
        megan.ncknm ="megs";
        megan.speak("hello boy");
        System.out.println(megan.getJob() +"\n");

        Person selena = new Person("Selena Gomez");
        selena.setAge(24);
        selena.setJob("Singer");
        selena.ncknm = "sel";
        selena.speak("hi");
        System.out.println(selena.getJob() +"\n");

        Person xenia = new Person("Xenia Tchoumitcheva");
        xenia.setAge(27);
        xenia.setJob("Model");
        xenia.speak("hello");
        System.out.println(xenia.getJob() +"\n");

        Person dytto = new Person("Courtney Kelly");
        dytto.setAge(19);
        dytto.setJob("Dancer");
        dytto.ncknm = "Dytto";
        dytto.speak("hey what up");
        System.out.println(dytto.getJob() +"\n");

        StringBuilder sb = new StringBuilder();
        sb.append("These are my top ")
        .append(Person.getCounter())
        .append(" female celebrities");
        System.out.println(sb.toString());
        System.out.print("do you want to know about any body?:");
        String ask = "name";
        switch (ask = masih.nextLine()){
            case "megan":
                System.out.println(megan.toString()+"\nthat's all we know about her."); break;
            case "selena":
                System.out.println(selena.toString()+"\nthat's all we know about her."); break;
            case "xenia":
                System.out.println(xenia.toString()+"\nthat's all we know about her."); break;
            case "dytto":
                System.out.println(dytto.toString()+"\nthat's all we know about her."); break;
            case "no":
                System.out.println("OK"); break;
            default:
                System.out.println("there is no person with the name " + ask);
        }

    }
}
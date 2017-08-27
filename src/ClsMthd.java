import java.util.*;
class Person {
    private String name;// instance variable
    private String job;
    public String ncknm;
    public int id;
    private static int counter = 0;
    //toString methods are useful for knowing which object is which in debugging
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Case ID: ")
        .append(id)
        .append("\nName: ")
        .append(name)
        .append("\nJob: ")
        .append(job);
        return sb.toString();
    }
    // setters always makes the main method shove values up into instance variables in the object but not directly
    public void setJob(String job){
        this.job = job;// this refers to the main instance variable to make distinguishable if there is any local variable having the same identifier
    }
    // Contructors can do setters job as below
    public Person(String name){
        id = counter;
        counter++;
        this.name = name;
        System.out.println("new person called " + name + " created");
    }
    void speak(String greeting){
        System.out.println(greeting);
        if(ncknm != null){
            System.out.printf("they call me %s \nbut ",ncknm);
        }
        System.out.print("My name is " + name + ", ");
    }
    // this is also a getter because it returns values
    int timeTillDeath(){
        int time = name.length()*100;
        return time;
    }
    // getters always return the value of of the priwate variables to allow it to be accessable in the main method but not directly.. so the getter basically becomes the instance variable
    String getName(){
        return name;
    }
    String getJob(){ return job; }
    static int getCounter(){return counter;}
    //int getId(){return id;} //this is commented out because the instance is public if i make it private i should use this getter
}
public class ClsMthd {
    public static void main(String[] args){
        Scanner masih = new Scanner(System.in);
        Person megan = new Person("Megan Fox");
        megan.setJob("Actor");
        megan.speak("hello boy");
        System.out.println(megan.getJob() +"\n"+ megan.timeTillDeath());
        Person selena = new Person("Selena Gomez");
        selena.setJob("Singer");
        selena.speak("hi");
        System.out.println("I am Number " + megan.id);
        System.out.println(selena.getJob() +"\n"+ selena.timeTillDeath());
        Person xenia = new Person("Xenia Tchoumitcheva");
        xenia.setJob("Model");
        xenia.speak("hello");
        System.out.println(xenia.getJob() +"\n"+ xenia.timeTillDeath());
        Person dytto = new Person("Courtney Kelly");
        dytto.setJob("Dancer");
        dytto.ncknm = "Dytto";
        dytto.speak("hey what up");
        System.out.println(dytto.getJob() +"\n"+ dytto.timeTillDeath());

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
class Person extends Creature implements Info {
    public String ncknm;
    private static int counter = 0;
    @Override
    void chk(){
        System.out.println(name + " has no biological errors");
    }

    //toString methods are useful for knowing which object is which in debugging
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Case ID: ")
                .append(id)
                .append("\nName: ")
                .append(name)
                .append("\nAge: ")
                .append(getAge())
                .append("\nJob: ")
                .append(job);
        return sb.toString();
    }

    // Constructors can do setters job as below
    public Person(String name){
        id = counter;
        counter++;
        this.name = name;
        System.out.println("new person called " + name + " created");
        Person.breathe(name);
        chk();
    }
    @Override
    void speak(String greet){
        System.out.println(greet);
        if(ncknm != null){
            System.out.printf("they call me %s \nbut ",ncknm);
        }
        System.out.print("My name is " + name + " and I am " +getAge()+" years old" + ", ");
    }

    // getters always return the value of of the priwate variables to allow it to be accessable in the main method but not directly.. so the getter basically becomes the instance variable
    String getName(){
        return name;
    }
    String getJob(){
        return job;
    }
    static int getCounter(){return counter;}

    @Override
    public void showInfo() {
        System.out.println("Person Name: " + name +".");
        System.out.println("Number of kills: ");
    }
    //int getId(){return id;} //this is commented out because the instance is public if i make it private i should use this getter
}
abstract class Creature {
        public String name;//to be private
        public int age;//to be private
        public int id;
        public String job;//to be private
        static void breathe(String nm){
            System.out.println("this newborn " +nm+" took her first breath");
        }

        void chk(){
            System.out.println("this creature has no biological errors");
        }
        // setters always makes the main method shove values up into instance variables in the object but not directly
        public void setJob(String job){
            this.job = job;// this refers to the main instance variable to make distinguishable if there is any local variable having the same identifier
        }
        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

    void speak(String speech){
        System.out.println(speech);
        System.out.print("My name is " + name + " and I am " +getAge()+" years old" + ", ");
    }
}


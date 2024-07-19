// constructor



public class code3 {
    static class student { // Define student as static to access from static context
        int rollno;
        String name;
        float marks;

        student() { // Constructor // with constructor no return type is req
            this.rollno = 12;
            this.name = "dEEVYANSH";
            this.marks = 90.9f;
        }

       void greeting(){
            System.out.println("hello my name is " +this.name);  // this name is doing or basically replacing itself with student1 // or basically obj
        }

        void changeName(String nn){
            name = nn;
        }
    }

    public static void main(String[] args) {
        student student1 = new student(); // Creating an instance of student
        System.out.println(student1.name); // Accessing student's name
        student1.changeName("DC");  // now NEW name is assigned // this will also be reflected in greetings method
        student1.greeting();    // it will print dEEVYANSH as already set kiya hua hai
    } 


}

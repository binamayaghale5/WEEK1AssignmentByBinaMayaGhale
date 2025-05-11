package easyToMedium.easy;

//4 Create a class Student with two attributes: name and age. Create a method displayInfo() that prints the student's name and age. In the main method, create a Student object and call displayInfo().
public class Student {
    public String name;
    public int age;

     Student(String name, int age){ //no return type, initializes above attribute => constructor
        this.name = name; // this.name= name => refers to the Student class's attributes
        this.age = age;
    }

    void displayInfo(){
        System.out.println("Name "+ this.name);
        System.out.println("Age "+ this.age);

    }

    public static void main(String[] args) {
        //creating object : ClassName variable = new ClassName(arguments);
        Student std1 = new Student("Samiksha", 18); // if there is constructor then pass the argument inside bracket
        std1.displayInfo();
    }
}

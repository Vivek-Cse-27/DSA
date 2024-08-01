 class Pen {
    // pen is class and it can have multiple object like p1,p2 etc
    String color;
    String type;
    public void write(){
        System.out.println("I can write anything");
    }
    public void pinfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        //non-parameterised constructor
        System.out.println("Constructor called");
    }
    Student (String name,int age){
        //parameterised constructor
        this.name=name;
        this.age=age;
    }
    Student (Student s3){
        //copy-constructor
        this.name=s3.name;
        this.age=s3.age;
    }
}
public class OOPS{
    public static void main( String args[]){
        Student s1 = new Student();
        s1.name = "Tisa";
        s1.age = 21;
        s1.printInfo();
        Student s2 = new Student("Vivek",22);
        s2.printInfo();
        Student s3 = new Student(s2);
        s3.printInfo();
        Pen p1 = new Pen();
        p1.color="Black";
        p1.type="ball";
        p1.pinfo();

    }
}
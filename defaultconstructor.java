class Student_de{
    String name;
    int roll;
    float CGPA;
    Student_de(String name,int roll,float CGPA){
        this.name=name;
        this.roll=roll;
        this.CGPA=CGPA;
    }

public void displaydetails(){
    System.out.println(name);
    System.out.println(roll);
    System.out.println(CGPA);
}}

public class defaultconstructor {
    public static void main(String[] args) {
        Student_de s =new Student_de("kichu", 10, 8.5f);
        s.displaydetails();
    }
    
}

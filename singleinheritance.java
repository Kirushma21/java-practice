class Shape{
    public void displaydetails(){
        System.out.println("hii");
    }

}
class rectangle extends Shape {
    public void area(){
        System.out.println("area");
    }
}

public class singleinheritance {
    public static void main(String[] args) {
        rectangle ob=new rectangle();
        ob.displaydetails();
        ob.area();
    }
    
}


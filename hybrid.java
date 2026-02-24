class Animal{
    public void display(){
       System.out.println("hi");
    }
}
class tiger extends Animal{
    public void name(){
        System.out.println("tiger");
    }
}
class lion extends tiger{
    public void happy(){
        System.out.println("lion");
    }
}
public class hybrid {
 public static void main(String[] args) {
    tiger t= new tiger();
    lion l=new lion();
    t.display();
    t.name();
    l.happy();
 }   
}

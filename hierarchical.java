class Fruit{
    public void display()
    {
        System.out.println("hi");
    }
}
class apple extends Fruit{ 
    public void height(){
        System.out.println("apple");
    }
}
class grapes extends Fruit{
    public void width(){
        System.out.println("grapes");
    }
} 
public class hierarchical {
   public static void main(String[] args) {
    apple a=new apple();
    grapes g=new grapes();
    a.display();
    a.height();
    g.display();
    g.width();
   }    
}

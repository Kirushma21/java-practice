class Colors{
    public void display(){
        System.out.println("hi");
    }
}
class rectangle extends Shape{
    public void area(){
        System.out.println("area");
    }
}
class triangle extends rectangle{
    public void surface(){
        System.out.println("surface");
    }

}
public class multilevelinheritance {
    public static void main(String[] args) {
        triangle c=new triangle();
        Colors s=new Colors();
        c.area();
        s.display();
        c.surface();
    }    
}

import java.util.Scanner;

public class q3 {
   public static void main(String[] args) {
    Scanner obj=new Scanner(System.in);
    String Name= obj.nextLine();
    double score= obj.nextDouble();
    obj.nextLine();
    String dept= obj.nextLine();
    System.out.println("my name is "+Name);
    System.out.println("my score is "+ score/10);
    System.out.println(dept);
   }    
}

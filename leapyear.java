import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if (year%4==0) {
            System.err.println("The given year"+year+"is leap year");
            
        }else{
            System.err.println("not a leap year");
        }
    }
    
}

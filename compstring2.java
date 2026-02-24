public class compstring2 {//not by reference method
    public static void main(String[] args) {
        String a= new String("apple");
        String b= new String("apple");
        if(a.equals(b)){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}

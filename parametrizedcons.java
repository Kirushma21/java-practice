public class parametrizedcons {
    parametrizedcons(){
        System.out.println("hi");
    }
    parametrizedcons(int a){
        System.out.println(a);
    }
    parametrizedcons(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        parametrizedcons ob=new parametrizedcons();
        parametrizedcons obj=new parametrizedcons(1);
        parametrizedcons obje=new parametrizedcons(1,2);
    }
    
}


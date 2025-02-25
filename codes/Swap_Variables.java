package codes;
public class Swap_Variables{

    static void swap1(int a,int b){
        
        int t=a;
        a=b;
        b=t;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    static void swap2(int a,int b){
        
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    static void swap3(int a,int b){
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
    
    static void swap4(int a,int b){
        
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }

    public static void main(String[] args) {
        int a=10;
        int b=5;
        
        System.out.println("\tbefore:- \na = "+a);
        System.out.println("b = "+b+"\n\n\tafter:-");
        swap1(a, b);
        swap2(a, b);
        swap3(a, b);
        swap4(a, b);
    }
}
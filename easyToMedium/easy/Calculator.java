package easyToMedium.easy;
public class Calculator {
     public int add(int a , int b){
        return a+b;
     }

     public int subtract(int a , int b){
        return a-b;
     }

     public int product(int a , int b){
        return a*b;
     }

     public double divide(int a , int b){
        return a/b;
     }

     public static void main(String[] args){

        Calculator cal = new Calculator();
        int a = 5;
        int b=10;

        int c = cal.add(a,b);
        int d = cal.subtract(a, b);


        System.out.println(c);
        System.out.println(d);
        

        
     }

     
}
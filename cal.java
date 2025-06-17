import java.util.*;
public class cal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to cli calculator");
        System.out.print("Enter A number ");
        int a = sc.nextInt();
        System.out.print("Select one operator(+,-,*,/): ");
        String z = sc.next();
        System.out.print("Enter B number ");
        int b = sc.nextInt();
        if(z.equals("+"))
        {
            System.out.println("Result : "+a+" + "+b+" = "+(a+b));
        }
        else if(z.equals("-"))
        {
            if(a>b){
                System.out.println("Result : "+a+" - "+b+" = "+(a-b));
            }
            else{
                System.out.println("Result : "+a+" - "+b+" = "+(b-a));
            }
        }
        else if(z.equals("*"))
        {
            System.out.println("Result : "+a+" * "+b+" = "+(a*b));
        }
        else if(z.equals("/"))
        {
           if(a==0 ||b==0)
           {
            System.out.println("Numbers cont be divided by Zero");
           }
           else
           {
            System.out.println("Result : "+a+" / "+b+" = "+(a/b));
           }
        }
    }
}

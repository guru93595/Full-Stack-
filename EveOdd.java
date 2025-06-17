import java.util.*;
public class EveOdd 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Welcome to cli calculator");
        System.out.print("Enter A number ");
        int a = sc.nextInt();
        if (a%2 == 0){
            System.out.println(a+" is Even Number");
        }
        else{
            System.out.println(a+" is Odd Number");
        }
    }
}

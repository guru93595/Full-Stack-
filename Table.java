import java.util.*;
public class Table {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //System.out.println("Welcome to cli calculator");
        System.out.print("Enter A number ");
        int a = sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.println(a+" * "+i+" = "+(a*i));
            i++;
        }
    }
}

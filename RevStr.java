import java.util.*;
public class RevStr 
{
    public static String WordCheck(String s)
    {
        String r ="";
        char ch;
        for (int i = 0; i < s.length(); i++) 
        {
            ch = s.charAt(i);
            r = ch + r; 
        }
        return r;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Word");
        String a = sc.next();
        String r=WordCheck(a);
        System.out.println("The reverse of String is "+r);
        if (a.equals(r)) {
            System.out.println("THE String IS A PALINDROME.");
        } else {
            System.out.println("THE String IS NOT A PALINDROME.");
        }
        System.out.println("Enter a number");
        int i = sc.nextInt();
        int h = NumCheck(i);
        System.out.println("The reverse of Number is "+h);
        if (i == h) {
            System.out.println("THE NUMBER IS A PALINDROME.");
        } else {
            System.out.println("THE NUMBER IS NOT A PALINDROME.");
        }
    }
    private static int NumCheck(int k) 
    {
        int original = k;
        int reverse = 0;
        while (k != 0) {
            int digit = k % 10;
            reverse = reverse * 10 + digit;
            k = k / 10;
        }
        return reverse;
    }
}

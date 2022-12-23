import java.util.Scanner;
public class setA4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String first,middle,last;
        System.out.println("Enter your First Name: ");
        first=s.next();
        System.out.println("Enter your middle Name: ");
        middle=s.next();
        String h=middle.substring(0,1);
        String sh=middle.substring(1);
        h=h.toUpperCase();
        String fs=h+sh;
        System.out.println("Enter your last Name: ");
        last=s.next();
        System.out.println(first+" "+ fs+" "+ last);
    }
}

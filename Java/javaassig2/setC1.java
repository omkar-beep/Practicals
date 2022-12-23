import java.util.Scanner;
import ConComp.*;

public class setC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1St String : ");
        String s1 = sc.nextLine();

        System.out.println("Enter 2nd String : ");
        String s2 = sc.nextLine();

        con1 c = new con1();
        c.displaycon(s1,s2);

        comp1 cm = new comp1();
        cm.displaycomp(s1,s2);

        sc.close();
    }

}
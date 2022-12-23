import java.io.*;
import java.util.*;

public class setA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name of File 1 : ");
        String f1 = sc.nextLine();

        System.out.println("Enter Name of File 2 : ");
        String f2 = sc.nextLine();

        try {
            FileInputStream fin = new FileInputStream(f1);
            FileOutputStream fout = new FileOutputStream(f2);
            int ch;

            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }
            String end = "\nEnd of File";
            byte b[] = end.getBytes();
            fout.write(b);
            System.out.println("File Content Copied\n");
            fin.close();
            fout.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}

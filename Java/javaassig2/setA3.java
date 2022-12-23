import java.util.Scanner;
public class setA3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] a=new int[5];
        System.out.println("1st No:");
        a[0]=s.nextInt();
        System.out.println("2nd No:");
        a[1]=s.nextInt();
        System.out.println("3rd No:");
        a[2]=s.nextInt();
        System.out.println("4th No:");
        a[3]=s.nextInt();
        System.out.println("5th No:");
        a[4]=s.nextInt();
        System.out.println("Array after sorted:");
        for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a.length;j++){
            int temp=0;
             temp=a[i];
             a[i]=a[j];
             a[j]=temp;
        }
        System.out.println(a[i]);
        }
}
}

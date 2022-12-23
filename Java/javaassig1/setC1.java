import java.util.*;
class setC1 {
    public static void main(String arg[]) {
        String name[]= new String[10];
        Scanner sc=new Scanner(System.in);
        int l = arg.length;
        String temp;
        int i;
        System.out.println("Enter city NAmes:");
        for( i=0;i<l;i++){
        name[i]=sc.nextLine();

        }
        for ( i = 0; i < l; i++) {
            name[i] = arg[i];
        }
        for (int j = 0; j < l; j++) {
            for (int k = j + 1; k < l; k++) {
                if ((name[j].compareTo(name[k])) < 0) {
                    temp = name[j];
                    name[j] = name[k];
                    name[k] = temp;
                }
            }
        }
        System.out.println("Sorted City Are-");
        for ( i = 0; i < l; i++) {
            System.out.println(name[i]);
        }
    }
}

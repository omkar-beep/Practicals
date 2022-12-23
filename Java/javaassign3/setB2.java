import java.util.Scanner;

interface Marker{

}
class product{
    int id;
    String name;
    int cost;
    int quantity;
    product(){
        id=10;
        name="tv";
        cost=25000;
        quantity=5;
    }
    product(int pid,String pname,int cst,int qunt){
        this.id=pid;
        this.name=pname;
        this.cost=cst;
        this.quantity=qunt;
    }
    void display(){
        System.out.println("\t"+id+"\t"+name+"\t"+cost+"\t"+quantity);
    }
}
public class setB2 {
public static void main(String[] args) {
    product p1=new product();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of product:");
    int n=s.nextInt();
    product pr[] = new product[n];
    for(int i=0;i<n;i++){
    System.out.println("Enter Product Id:");
    int pid=s.nextInt();
    System.out.println("Enter product Name:");
    String pname=s.next();
    System.out.println("Enter product Cost:");
    int cst=s.nextInt();
    System.out.println("Enter product Quantity:");
    int qunt=s.nextInt();
    pr[i]= new product(pid,pname,cst,qunt);
    }
    System.out.println("\n\t\t Product Details\n");
        System.out.println("\tId\tPname\tCost\tQuantity\n");
        for (int i = 0; i < n; i++) {
            pr[i].display();
        }


}
}

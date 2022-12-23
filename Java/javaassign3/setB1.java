abstract class order{
        int id;
        String Description;
}
class PurchesOrder extends order{
   String custName;
   String Vendorname;
   void accept(int n,String des,String cus,String ven){
    id=n;
    Description=des;
    custName=cus;
    Vendorname=ven;
}
void display(){
    System.out.println("Purches Orders:");
    System.out.println("Id:"+id);
    System.out.println("Description:"+Description);
    System.out.println("Customer Name: "+custName);
    System.out.println("Vendor Name:"+Vendorname);
}
}
class SalesOrder extends order{
    String Vendorname;
   String custName;
    void accept(int n,String des,String cus,String ven){
         id=n;
         Description=des;
         custName=cus;
         Vendorname=ven;
    }
    void display(){
        System.out.println("Sales Orders:");
        System.out.println("Id:"+id);
        System.out.println("Description:"+Description);
        System.out.println("Customer Name: "+custName);
        System.out.println("Vendor Name:"+Vendorname);
    }
}
public class setB1 {
    public static void main(String[] args) {
        PurchesOrder s1=new PurchesOrder();
        PurchesOrder s2=new PurchesOrder();
        PurchesOrder s3=new PurchesOrder();

        s1.accept(10,"Nice","vishal","xyz");
        s2.accept(11,"best","s","hfd");
        s3.accept(12,"ok","f","rte");
        s1.display();
        System.out.println("--------------");
        s2.display();
        System.out.println("--------------");
        s3.display();
        System.out.println("--------------");

        SalesOrder a1=new SalesOrder();
        SalesOrder a2=new SalesOrder();
        SalesOrder a3=new SalesOrder();
        a1.accept(20,"done","dd","oeu");
        a2.accept(21,"done","ww","wer");
        a3.accept(22,"done","rr","fgf");
        a1.display();
        System.out.println("--------------");
        a2.display();
        System.out.println("--------------");
        a3.display();
        System.out.println("--------------");
    }
}

abstract class Staff{
protected int id;
protected String name;
Staff(int n,String nm){
    this.id=n;
    this.name=nm;
}
}
class OfficeStaff extends Staff{
String department;
OfficeStaff(int n,String nm,String dep){
    super(n,nm);
    this.department=dep;
}
void display(){
    System.out.println("ID:"+id);
    System.out.println("Name:"+name);
    System.out.println("Department Name:"+department);
}
}

public class setA2 {
    public static void main(String[] args) {
        OfficeStaff s1=new OfficeStaff(10,"vishal","bcs");
        OfficeStaff s2=new OfficeStaff(11,"ganesh","bcs");
        OfficeStaff s3=new OfficeStaff(12,"shubham","bcs");
        s1.display();
        System.out.println("---------------");
        s2.display();
        System.out.println("---------------");
        s3.display();
        System.out.println("---------------");
    }
}

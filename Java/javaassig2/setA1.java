class employe{
    static int id,salary;
    static String name,deptname;
    employe(){
        id=12;
        salary=25000;
        name="jon";
        deptname="bca";
    }
    employe(int n,int sal,String nm,String dnm){
        id=n;
        salary=sal;
      name=nm;
      deptname=dnm;
    }

}
public class setA1{
    public static void main(String[] args) {
        employe s1=new employe(10,20000,"vishal","bcs");
        System.out.println("Id :"+s1.id);
        System.out.println("Salary :"+s1.salary);
        System.out.println("Name :"+s1.name);
        System.out.println("Deptname :"+s1.deptname);

    }
}
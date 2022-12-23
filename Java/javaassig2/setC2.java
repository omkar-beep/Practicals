class customer{
    public String name="vishal";//access by any package and classes
    private int num;// limited to class only
    protected int password;// limited to the classes and subclasses of same package
    String address;//access limited to the package only
}
class demo{
    
}
public class setC2 {
    public static void main(String[] args) {
        customer d =new customer();
        demo s=new demo();
    }
}

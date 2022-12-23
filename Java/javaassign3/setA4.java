interface Cube{
    public void cub();
    int num=3;
}
class second implements Cube{
    public void cub(){
    int cube3=num*num*num;
    System.out.println("Cube of Number:"+cube3);
    }

}
public class setA4 {
   public static void main(String[] args) {
       second s=new second();
       s.cub();
   } 
}

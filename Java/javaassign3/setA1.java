class continent{
String con;
 continent(){
     this.con="Asia";
System.out.println("Continent: "+con);
}
}
class country extends continent{
    String country;
     country(){
         this.country="india";
        System.out.println("Counrty Name: "+country);
        }
}
class place extends country{
    String place;
    place(){
        this.place="Shrigonda";
        System.out.println("Place Name: "+place);
        }
}

public class setA1{
    public static void main(String[] args) {
        place p1=new place();
    }
}
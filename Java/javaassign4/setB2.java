import java.util.*;
class InvalidUsernameException extends Exception{
String msg="Invalid UserName";
public String toString(){
    return msg;
}
}

class InvalidPasswordException extends Exception{
    String msg="Invalid Password";
    public String toString(){
        return msg;
    }
}

class EmailId{
    String username;
    String password;
    EmailId(){
        
    }
    EmailId(String urn,String pass){
       this.username=urn;
       this.password=pass;
    }
}
public class setB2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        String urn=sc.next();
        System.out.println("Enter Password:");
        String pass=sc.next();
        EmailId e1=new EmailId(urn,pass);
        String s1=e1.username;
        String s2="vishal";
        String s3=e1.password;
        String s4="vishal@123";
        
            try {
                if (s1.equals(s2)) {
                    System.out.println("Username Matched..!");
                
                }
                else{
                throw new InvalidUsernameException();
                }
            } 
            catch (InvalidUsernameException e) {
                System.out.println(e);
            }
    
            try {
                if (s3.equals(s4)) {
                    System.out.println("Password Matched..!");
                
                }
                else{
                throw new InvalidPasswordException();
                }
            } 
            catch (InvalidPasswordException e) {
                System.out.println(e);
            }
        
    }
}

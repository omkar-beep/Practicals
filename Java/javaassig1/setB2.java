class Mynumber{
    private int no;
    Mynumber(){
        no=0;
    }
    Mynumber(int no){
        this.no=no;
    }
    void isNegative(){
        if(no<0){
            System.out.println("Given number is negative");
        }
    }
    void isPositive(){
        if(no>0){
            System.out.println("Given number is positive");
        }
    }
    void isZero(){
        if(no==0){
            System.out.println("Given number is Zero");
        }
    }
    void isOdd(){
        if((no%2)==1){
            System.out.println("Given number is Odd");
        }
    }
    void isEven(){
        if((no%2)==0){
            System.out.println("Given number is Even");
        }
    }
}

public class setB2{
    public static void main(String[] args) {
        
        Mynumber n = new Mynumber(5);
        n.isNegative();
        n.isPositive();
        n.isZero();
        n.isOdd();
        n.isEven();
    }
}
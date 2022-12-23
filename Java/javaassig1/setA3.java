import java.util.Scanner;

class volume{
double pi=3.14;
int r=4;
int h=5;

int i,fact=1,num=5;

void volumecly(){
double V = pi*(r*r)*h;
System.out.println("Volume of cylinder: "+V);
}

void factorial(){
for(i=1;i<=num;i++)
fact=fact*i;
System.out.println("Factorial: "+fact);
}

void armstrong(){
    int num=370,number,temp,total=0;
number = num;
while(number !=0){
    temp=number %10;
    total=total+temp*temp*temp;
    number /= 10;
}
if(total==num){
    System.out.println(num +"is armstrong");
}
else{
    System.out.println(num +"is Not armstrong number");
}
}
void exit(){
    System.out.println("Exit");
}
}
public class setA3 {
    public static void main(String[] args) {
        volume s = new volume();
    Scanner scan = new Scanner(System.in);

    int choice;

    do {
      System.out.println("\nChoose the operation,");
      System.out.println("----------------------------");
      System.out.println("1. Calculate the volume of cylinder.");
      System.out.println("2. Find the factorial.");
      System.out.println("3. Cheak the Number is Armstrong or not.");
      System.out.println("4. Exit");
      System.out.println("----------------------------");
      System.out.print("Enter your choice: ");
      choice = scan.nextInt();

      switch (choice){
          case 1:s.volumecly();
          break;
          case 2:s.factorial(); 
          break;
          case 3:s.armstrong();
          break;
          case 4:s.exit();
          return;
          default:
        System.out.println("Invalid input.");
        System.out.println("Please enter the correct input.");
      }
    }while(true);
    }

}

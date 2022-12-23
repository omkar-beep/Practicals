 class Rect{
int l,b;
void setdata(int x,int y){
l=x;
b=y;
}
void showdata()
{
System.out.println("length= "+l);
System.out.println("breadth= "+b);
}
int area()
{
return(l*b);
}
int perimeter(){
    return 2*(l*b);
}
}
class areaRect{
public static void main(String args[]){
Rect R1=new Rect();
R1.setdata(30,5);
R1.showdata();
int a1=R1.area();
int a2=R1.perimeter();
System.out.println("Area of Rectngle= "+a1);
System.out.println("perimeter= "+a2);
}
}

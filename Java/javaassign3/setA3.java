interface operation{
    public void area();
    public void  volume();
    Double PI=3.142;
    int rad=4;
    int height=5;
}
class cylinder implements operation{
    public void  area(){
       double Cylarea=2*PI*rad*height + 2*PI*rad*rad;
       System.out.println("Area Of Cylinder:"+Cylarea);
    }
    public void volume(){
        double clyvolume=PI*rad*rad*height;
        System.out.println("Volume Of Cylinder:"+clyvolume);
    }
}
class setA3{
    public static void main(String[] args) {
        cylinder c1=new cylinder();
        c1.area();
        c1.volume();
    }
}
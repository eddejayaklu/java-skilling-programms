class Circle{
double radius;
Circle(double r)
{
 radius=r;
}
double area(){
double a=3.14*radius*radius;
return a;
}
double circumefrence(){
double b=2*3.14*radius;
return b;
}
}
public class Circles{
public static void main(String args[])
{
Circle c1=new Circle(4);
double ar=c1.area();
double cr=c1.circumefrence();
System.out.println("area"+ar);
System.out.println("circumefrence"+cr);
}
}


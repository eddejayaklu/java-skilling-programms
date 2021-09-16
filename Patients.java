class Patient{
String name;
double height;
double weight;
Patient(String name,double height,double weight){
 this.name=name;
 this.height=height;
 this.weight=weight;
}
double Bmi(){
 double a=(this.weight)*703/(this.height*this.height) ;
 return a;
}
}
public class Patients{
public static void main(String [] args){
Patient p1=new Patient("Jaya",50,7);
double c=p1.Bmi();
System.out.println(c);
}
}
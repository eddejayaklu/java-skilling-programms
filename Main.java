import java.util.Scanner;
class Main{
  public static void main(String args[]){
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter name,age and salary");
  String name=obj.nextLine();
  int a=obj.nextInt();
  double b=obj.nextDouble();
  System.out.println("Name:"+name);
  System.out.println("Age:"+a);
  System.out.println("Salary:"+b);
 }
}
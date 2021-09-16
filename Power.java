import java.util.Scanner;
class Power{
  public static void main(String args[]){
  Scanner obj=new Scanner(System.in);
  System.out.println("Enter x and y values:");
  int a=obj.nextInt();
  int b=obj.nextInt();
  int c=1;
  for(int i=0;i<b;i++)
  { 
    c=c*a;
  }
  System.out.println("power"+c);
  
 }
}



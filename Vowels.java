import java.util.Scanner;
import java.lang.String;
class Vowels{
  public static void main(String args[]){
  Scanner obj=new Scanner(System.in);
  String a=obj.nextLine();
  int b=a.length();
  int c=0;
  for(int i=0;i<b;i++)
  {
    char x=a.charAt(i);
    if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u')
      c++;
  }
 System.out.println("no of vowels"+c);
 }
}



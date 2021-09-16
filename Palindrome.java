import java.util.Scanner;
import java.lang.String;
class Palindrome{
  public static void main(String args[]){
  Scanner b1=new Scanner(System.in);
  String s=b1.nextLine();
  int i=0,j=s.length()-1;
  int c=0;
  while(i<j){
   if(s.charAt(i)!=s.charAt(j))
   {
     c=1;
     break;
   }
   i=i++;
   j=j--;
   }
  if(c==1)
    System.out.println("true");
  else{
      System.out.println("false");
   }
}
}
     
  
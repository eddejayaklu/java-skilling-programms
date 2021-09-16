import java.util.Scanner;
import java.lang.String; 	
class Last{
 public static void main(String args[]){
   Scanner obj=new Scanner(System.in);
   String s1=obj.nextLine();
   String words[]=s1.split(" ");
   int b=words.length;
   int c=words[b-1].length();
   System.out.println(c);
 }
}

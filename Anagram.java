import java.util.Scanner;
import java.lang.String; 	
class Anagram{
 public static void main(String args[]){
   Scanner obj=new Scanner(System.in);
   String s1=obj.nextLine();
   int c=0;
   ja: for(int i=0;i<s1.length();i++,c=0){ 
    for(int j=0;j<s1.length();j++){
     if((s1.charAt(i)==s1.charAt(j)){
        c++;
        char d=s1.charAt(i);
     }
    }
    if(c==1)
    break ja;
   }
  System.out.println(
 }
}

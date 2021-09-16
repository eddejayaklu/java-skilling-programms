import java.util.Scanner;
import java.lang.String;
class Alpha{
  public static void main(String args[]){
  Scanner obj=new Scanner(System.in);
  String s1=obj.nextLine();
  String s2="abcdefghijklmnopqurstuvwxyz";
  int c=0;
  for(int i=0;i<26;i++){
	for(int j=0;j<s1.length();j++){
	 if(s1.charAt(j)==s2.charAt(i)){
          c++;
          break;
           }
      } 
    }
 if(c>=26){
  System.out.println("1");
  }
 else{
  System.out.println("-1");
   }
}
}


  
    
   
  
  
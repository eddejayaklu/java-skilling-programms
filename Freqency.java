class Frequecncy{
    public static void main(String args[]){
     int b[][]=new int[args.length][2];
     int a[]=new int[args.length];
     int k=0;
     for(int i=0;i<args.length;i++)
     {
      int c=0;
      for(int j=0;j<args.length;j++)
      {
       if((Integer.parseInt(args[i])==(Integer.parseInt(args[j])){
       c++;
       }
      }
       b[k][0]=Integer.parseInt(args[i]);
       b[k][1]=c;
       k++;
      }
     for(int i=0;i<a.length;i++)
     {
       System.out.println(a[i]);
     } 
 }
}
      
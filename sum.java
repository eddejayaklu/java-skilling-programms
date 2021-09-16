class Sum{
	public static void main(String args[]){
        int a=Integer.parseInt(args[0]);
	for(int i=1;i<args.length;i++)
        {
	  if((Integer.parseInt(args[i])<a))
          {
		a=Integer.parseInt(args[i]);
           }
         }
        int sum=0;
	for(int i=0;i<args.length;i++)
        {
          if((Integer.parseInt(args[i])!=a))
	   {
	     sum=sum+Integer.parseInt(args[i]);
	   }
	}
       System.out.println(sum);
 }
}
          
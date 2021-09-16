class Reverse{
	public static void main(String args[]){
          int c=args.length;
          int x[][]=new int[2][];
	  x[0]=new int[2];
	  x[1]=new int[2];
          for(int i=0;i<x.length;i++)
	    {
	      for(int j=0;j<(x[i].length);j++)
		{
		  x[i][j]=Integer.parseInt(args[c-1]);
           	  System.out.print(x[i][j]);
                  c=c-1;
                 }
               System.out.println();
             }
 }
}
	 
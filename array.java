public class array{
    public static void main(String args[])
      {
        int a[]=new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
 	a[3]=4;
	a[4]=5;
	int pos=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        for(int i=5;i>=pos;i--)
        {
	  a[i]=a[i-1];
	}
        a[pos-1]=b;
        for(int i=0;i<6;i++)
	{
	 System.out.println(a[i]);
	}
  }
}
   
    
	
        
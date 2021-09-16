class Object{
  int a=10;
  void disp()
  {
    System.out.println("value of a is:"+ a);
   }   
  public static void main(String args[])
   {
    Object obj=new Object();
    System.out.println(obj.a);
    obj.disp();
   }
}
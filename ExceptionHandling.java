public class ExceptionHandling
{
 public static void main(String args[])
 {
  try
  {
   int a[]={10,20,30,40,50};
   System.out.println(a[0]);
   System.out.println(a[1]);
   System.out.println(a[2]);
   System.out.println(a[3]);
   System.out.println(a[4]);
   System.out.println(a[5]);
 }
 catch(Exception ex)
 {
  ex.printStackTrace();
 }
  System.out.println("Program Terminated");
 }
}
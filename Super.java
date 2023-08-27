class StudentInfo
{
 int rollno = 20;
 String name = "TANVI";
}

class OtherStudent extends StudentInfo
{
 int rollno = 30;
 String name = "ADITYA" ;
 
 void display()
 {
  System.out.println("ROLL NO : " +rollno);
  System.out.println("NAME : " +name);
  System.out.println("ROLL NO : " +super.rollno);
  System.out.println("NAME : " +super.name);
 }
}

class Super
{
 public static void main(String args[])
 {
  OtherStudent s1 = new OtherStudent();
  s1.display();
 }
}
class StudentInfo
{
 int rollno = 20;
 String name = "TANVI";
 
 void display()                              //method override
 {
  System.out.println("ROLL NO : " +rollno);
  System.out.println("NAME : " +name);
 }
}

class StudentMarks extends StudentInfo
{
 int OOP = 95;
 int OS = 68;
 
 void display()                             //method override
 {
  System.out.println("OOP MARKS : " +OOP);
  System.out.println("OS Marks : " +OS );
 }
}

class MethodOverriding
{
 public static void main(String args[])
 {
  StudentInfo s1 = new StudentInfo();
  s1.display();
  StudentMarks s2 = new StudentMarks();
  s2.display();
 }
}

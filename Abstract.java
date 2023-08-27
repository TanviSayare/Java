abstract class Student
{
 int rollno = 10;
 String name = "TANVI";
 
 abstract void display();
}

class StudentMarks extends Student
{
 int OOP = 80;
 int DBMS = 90;
 
 void display()
 {
  System.out.println("ROLL NO : " +rollno);
  System.out.println("NAME : " +name);
  
  System.out.println("OOP MARKS : " +OOP);
  System.out.println("DBMS MARKS : " +DBMS);
 }
}

class Abstract 
{
 public static void main(String args[])
 {
  StudentMarks s1 = new StudentMarks();
  s1.display();
 }
}
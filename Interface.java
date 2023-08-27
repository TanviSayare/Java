interface StudentInfo
{
 int rollno = 50;
 String name = "TANVI";
 
 public void displayInfo();
 
}

interface StudentMarks extends StudentInfo
{
 int OOP = 70;
 int M1 = 80;
 
 public void displayMarks();
 
}

class Student implements StudentInfo, StudentMarks
{
 public void displayInfo()
 {
  System.out.println("ROLL NO : " +rollno);
  System.out.println("NAME : " +name);
 }
 
 public void displayMarks()
 {
  System.out.println("OOP MARKS : " +OOP);
  System.out.println("M1 MARKS : " +M1);
 }
}

class Interface
{
 public static void main(String args[])
 {
  Student s1 = new Student();
  s1.displayInfo();
  s1.displayMarks();
 }
}
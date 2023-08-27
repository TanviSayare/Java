class StudentInfo
{
 int rollno =20;
 String name = "Tanvi";
 
 public void displayInfo()
 {
  System.out.println("Roll No : " +rollno);
  System.out.println("Name : " +name);
 }
}

class StudentMarks extends StudentInfo
{
 int OOP = 50;
 int DS = 70;
 
 public void displayMarks()
 {
  System.out.println("OOP : " +OOP);
  System.out.println("DS : " +DS);
 }
}

class Inheritance
{
 public static void main(String args[])
 {
  StudentMarks s1 = new StudentMarks();
  
  s1.displayInfo();
  s1.displayMarks();
 }
}
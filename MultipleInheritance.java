interface StudentInfo
{
 int rollno = 40;
 String name = "Tanvi";
 
 public void displayInfo();
 
}

interface StudentMarks
{
 int OOP = 80;
 int M2 = 90;
 
 public void displayMarks();
 
}

class Student implements StudentInfo , StudentMarks
{
 public void displayInfo()
 {
  System.out.println("Roll No : " +rollno);
  System.out.println("Name : " +name);
 }
 
 public void displayMarks()
 {
  System.out.println("OOP Marks : " +OOP);
  System.out.println("M2 Marks : " +M2);
 } 
}

class MultipleInheritance
{
 public static void main(String args[])
 {
 Student s1 = new Student();
 
 s1.displayInfo();
 s1.displayMarks();
 }
}
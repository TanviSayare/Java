class StudentInfo
{
 int rollno = 38;
 String name = "Tanvi";
 
 void displayInfo()
 {
  System.out.println("Roll No : " +rollno);
  System.out.println("Name : " +name);
 }
}

class StudentMarks extends StudentInfo
{
 int OOP = 80;
 int M3 = 90;
 
 void displayMarks()
 {
  System.out.println("OOP Marks : " +OOP);
  System.out.println("M3 Marks : " +M3);
 }
}

class StudentAddress extends StudentInfo
{
 String address = "Amravati";

 void displayAddress()
 {
  System.out.println("Address : " +address);
 } 
}

class HierarchicalInheritance
{
 public static void main(String args[])
 {
  StudentMarks s1 = new StudentMarks();
  s1.displayInfo();
  s1.displayMarks();
  StudentAddress s2 = new StudentAddress();
  s2.displayAddress();
 }
}
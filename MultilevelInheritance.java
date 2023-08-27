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
 int OOP = 90;
 int M3 = 80;
 
 void displayMarks()
 {
  System.out.println("OOP Marks : " +OOP);
  System.out.println("M3 Marks : " +M3);  
 }
}

class StudentResult extends StudentMarks
{
  String result = "PASS";
  
  void displayResult()
  {
   System.out.println("Result : " +result);
  }
}

class MultilevelInheritance
{
 public static void main(String args[])
 {
  StudentResult s1 = new StudentResult();
  
  s1.displayInfo();
  s1.displayMarks();
  s1.displayResult();
 }
}
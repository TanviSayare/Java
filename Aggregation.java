class StudentInfo
{
 int rollno = 26;
 String name = "TANVI";
}

class StudentMarks
{
 public StudentInfo s1 = new StudentInfo();  //Agregation
 int OOP = 87;
 int AI = 96;
 
 void displayMarks()
 {
  System.out.println("ROLL NO : " +s1.rollno);
  System.out.println("NAME : " +s1.name);
  System.out.println("OOP MARKS : " +OOP);
  System.out.println("AI MARKS : " +AI);
 }
}

class Aggregation
{
 public static void main(String args[])
 {
  StudentMarks s2 = new StudentMarks();
  s2.displayMarks();
 }
}
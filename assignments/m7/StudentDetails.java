class StudentDetails {
private String student;
private String rollNo;
private double subject1;
private double subject2;
private double subject3;
public StudentDetails(String student, String rollNo, double sub1,double sub2 ,double sub3 ) {
this.student = student;
this.rollNo = rollNo;
this.subject1 = sub1;
this.subject2 = sub2;
this.subject3 = sub3;
}
public double GPA() {
return (subject1+subject2+subject3)/3;
}
public static void main(String args[]) {
StudentDetails s1 = new StudentDetails("Shivani", "0009", 9.0, 8.0, 10.0);
System.out.println(s1.GPA());
StudentDetails s2 = new StudentDetails("Somesh", "0008", 8.0, 7.0, 9.0);
System.out.println(s2.GPA());
StudentDetails s3 = new StudentDetails("Akhil", "0007", 8.0, 9.0, 10.0);
System.out.println(s3.GPA());
}
}
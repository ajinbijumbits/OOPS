import java.util.Scanner;
int Empid;
string Name;
double Salary;
string Adderss;

employee(int no, string na, double sal, String add) {
this.Empid = no;
this.Name = na;
this.Salary = sal;
this.Adderss = add;
}
}

class Teacher extends Employee  {
String dept;
String subject;

Teacher(int no, String na, double sal, String add, String dep,String sub) {
super(no,na,sal,add);
this.dept = dep;
this.subject = sub;
}


void display() {
 System.out.println("Employee id: " + Empid);
 System.out.println("Name: " + Name);
 System.out.println("Salary: " + Salary);
 System.out.println("Adderss: " + Adderss);
 System.out.println("Department: " + Department;
 System.out.println("Subject: " + subject);
}

public static void main(String[] args) {
  System.out.println("\n Enter the no. of employee");
  Scanner sc1 = new Scanner(System.in);
  int num = sc1.nextInt();
  Teacher[] arr = new Teacher[num];
import java.util.Scanner;
class Employee {
public String eNo;
public String eName;
public int eSalary;
public Employee(String eNo,String eName,int eSalary)
{
this.eNo = eNo;
this.eName = eName;
this.eSalary = eSalary;
}
}
public class employee_details {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter count of Employee list:");
int count = Integer.parseInt(scan.nextLine());
Employee[] employee = new Employee[count];
for (int i=0;i<count;i++)
{
System.out.println("Enter Number of employees:");
String eNo=scan.nextLine();
System.out.println("enter the Name of employee");
String eName = scan.nextLine();

System.out.print("Enter salary of employee:");
int eSalary = Integer.parseInt(scan.nextLine());
employee[i] = new Employee(eNo,eName,eSalary);
}
System.out.println("Enter the number of empolyee to be filterd out :");
String search = scan.nextLine();
for(int i=0;i<count;i++){
if(employee[i].eNo.equals(search))
{
System.out.println("Employee Number : "+employee[i].eNo);
System.out.println("Employee Name : "+employee[i].eName);
System.out.println("Employee Salary : "+employee[i].eSalary);
}
}
}
}







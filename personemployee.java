import java.util.Scanner;
class Person {
String Name;
String Gender;
String Adderss;
int Age;

Person(String na,String ge,String add,int age) {
this.Name = na;
this.Gender = ge;
this.Adderss = add;
this.Age = age;
}
}
class employee extends Person {
int Empid;
String Company_name;
String Qualification;
int Salary;
employee(String na,String ge,String ad,int id,String co_name,String qua,double sa){
super(na,ge,add);
this.emp_id=id;
this.company_name=co_name;
this.qualification=qua;
this.salary=sa;
}
}
class personemployee extends employee{
int teacher_id;
String subject;
String department;
personemployee(String na,String ge,String ad,int id,String co_name,String qua,double sa,int t_id,String sub,String dep){
super(na,ge,add,id,co_name,qua,sa);
this.teacher_id=t_id;
this.subject=sub;
this.department=dep;
}


void display() {
   System.out.println("_Person Details_");
   System.out.println("Person Name: " + Name); 
   System.out.println("Gender: " + Gender); 
   System.out.println("Address: " + Adderss); 
   System.out.println("Employee details_"); 
   System.out.println("Employee id: " + emp_id);
   System.out.println("Company: " + co_name); 
   System.out.println("Qualification: " + qua);
   System.out.println("Salary: " + sa); 
   System.out.println("_Teacher Information_");
   System.out.println("Teacher ID: " + t_id); 
   System.out.println("Subject: " + sub); 
   System.out.println("Department: " + dep); 
} 
public static void main(String[] args){
System.out.println("Enter the number of information you store:");
Scanner sc1=new Scanner(System.in);
int i;
int num=sc1.nextInt();
personemployee[] arr=new personemployee[num];
for(i=0;i<num;i++){
 Scanner sc = new Scanner(System.in); 
  System.out.println("\nEnter Person  Name: "); 
  String p_name = sc.nextLine(); 
  System.out.println("\nEnter Gender: "); 
  String Gender = sc.nextLine(); 
  System.out.println("\nEnter Address of person: "); 
  String address = sc.nextLine();
  System.out.println("\nEnter Employee id: "); 
  int id = sc.nextInt();
  sc.nextLine();
  System.out.println("\nEnter Company Name: "); 
  String Company = sc.nextLine(); 
  System.out.println("\nEnter Qualification: "); 
  String Qualification = sc.nextLine(); 
  System.out.println("\nEnter Salary: "); 
  double salary = sc.nextInt(); 
  sc.nextLine();
  System.out.println("\nEnter Teacher id: "); 
  int t_id = sc.nextInt(); 
  sc.nextLine();
  System.out.println("\nEnter Subject: "); 
  String subject = sc.nextLine(); 
  System.out.println("\nEnter Department: "); 
  String department = sc.nextLine(); 
  arr[i]=new personemployee(p_name,Gender,address,id,Company,Qualification,salary,t_id,subject,department);

}
System.out.println("\n Informations......");
 for ( i = 0; i < num; i++) { 
  arr[i].display(); 
}
sc1.close();
}
}

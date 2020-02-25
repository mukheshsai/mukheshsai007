import java.util.Scanner;
class Employee 
{
private String firstName;
private String lastName;
private double monthlySalary;

public Employee(String f, String l, double m)
{
firstName = f;
lastName = l;
if(m < 0)
{
monthlySalary =0;
}
else {monthlySalary = m;}
}

public String getFirstName() 
{
return firstName;
}

public void setFirstName(String fname) {
firstName = fname;
}


public String getLastName() {
return lastName;
}
public void setLastName(String lname) {
lastName = lname;
}
public double getMonthlySalary() {
return monthlySalary;
}
public void setMonthlySalary(double m) {
if(m < 0){
monthlySalary =0;
}
else monthlySalary = m;
}
};
class EmployeeTest 
{
public static void main(String[] args)
{
Scanner S = new Scanner(System.in);
String fname;
String lname;
double sal,newsalary;
System.out.println("First Employee : ");
System.out.println("Enter the first name: ");
fname = S.next();
System.out.println("Enter the last name: ");
lname = S.next();
System.out.println("Enter the Salary: ");
sal = S.nextDouble();
Employee e1 =new Employee(fname,lname ,sal );
System.out.println("Second Employee : ");
System.out.println("Enter the first name: ");
fname = S.next();
System.out.println("Enter the last name: ");
lname = S.next();
System.out.println("Enter the Salary: ");
sal = S.nextDouble();
Employee e2 =new Employee(fname,lname ,sal );
System.out.println("the yearly salary of "+e1.getFirstName()+" "
+e1.getLastName()+" :");
System.out.println(e1.getMonthlySalary()*12);
newsalary= e1.getMonthlySalary()*0.1+e1.getMonthlySalary();
e1.setMonthlySalary(newsalary);

System.out.println("the new yearly salary of "+
e1.getFirstName()+" "+e1.getLastName()+" :");
System.out.println(e1.getMonthlySalary()*12);
e1.getMonthlySalary();

System.out.println("the yearly salary of "+e2.getFirstName()+" "
+e2.getLastName()+" :");
System.out.println(e2.getMonthlySalary()*12);
newsalary= e2.getMonthlySalary()*0.1+e2.getMonthlySalary();
e2.setMonthlySalary(newsalary);

System.out.println("the new yearly salary of "+
e2.getFirstName()+" "+e2.getLastName()+" :");
System.out.println(e2.getMonthlySalary()*12);
e2.getMonthlySalary();
}
}
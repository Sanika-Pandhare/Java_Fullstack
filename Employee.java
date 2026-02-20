/*

local variable-per object -have a default value 
static variable -per class-have default values
*/


class Employee
{

int id;
String name;
int salary;
static int count;

Employee(int eid,String ename, int esalary)
{
System.out.println("employee object created using 3 arg constructor");
this.id=eid;
this.name=ename;
this.salary=esalary;
count++;
System.out.println(count);

}

public static void main(String args[])
{
Employee e=new Employee();
Employee e1=new Employee(1,"sanika",10000);
System.out.println(e1.id);
System.out.println(e1.name);
System.out.println(e1.salary);

Employee e2=new Employee(2,"Dipali",3000);
System.out.println(e2.id);
System.out.println(e2.name);
System.out.println(e2.salary);



}

}
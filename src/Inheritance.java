/*Design and develop inheritance for a given case study, identify objects and relationships and
implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address,Mail_id, and Mobile_noas members. 
Inherit the classes: Programmer, Team Lead, Assistant Project
Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the
inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff
club fund. Generate pay slips for the employees with their gross and net salary.*/
class Employee{
	String name,address,mail;
	float id,mobile,basic;
	
	void salary() {
		
	float da,hra,pf,cf,gross;
	da=basic*97/100;
	hra=basic*10/100;	
	pf=basic*12/100;	
    cf=0.1f/100;
    System.out.println("name: "+name);
	gross=basic+da+hra-pf-cf;	
	System.out.println("Basic Salary: "+basic);	
	System.out.println("Gross Salary: "+gross);
	
	}
		
}
class Programmer extends Employee{
 Programmer(String name, int sal){
	 this.name=name;
	 basic=sal;
 }
 
}
class TeamLeader extends Employee{
	TeamLeader(String name, int sal){
		 this.name=name;
		 basic=sal;
	 }
	
}
class APM extends Employee{
	APM(String name, int sal){
		 this.name=name;
		 basic=sal;
	 }
	
}
class ProjectManager extends Employee{
	ProjectManager(String name, int sal){
		 this.name=name;
		 basic=sal;
	 }
}

public class Inheritance {
public static void main(String[]args) {
	Programmer p=new Programmer("Kamesh", 40000);
	p.salary();
	TeamLeader t=new TeamLeader("Atharva", 100000);
	t.salary();
	APM a=new APM("Tejas",5000);
	a.salary();
	ProjectManager m=new ProjectManager("Harsh", 30000);
	m.salary();
		
    }

}

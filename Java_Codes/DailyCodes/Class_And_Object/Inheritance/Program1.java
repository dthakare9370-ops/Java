class Company{
	static String cmpName="Microsoft";
	static String cmpLoc="Pune";

	void cmpInfo(){
		System.out.println(cmpName);
		System.out.println(cmpLoc);
	}
}

class Employee extends Company{
	static String empName="Ashish";
	static double empSalary=2.5;

	void empInfo(){
		System.out.println(empName);
		System.out.println(empSalary);
	}
}

class Program1{
	public static void main(String args[]){
		Employee emp = new Employee();
		emp.cmpInfo();
		emp.empInfo();
	}
}

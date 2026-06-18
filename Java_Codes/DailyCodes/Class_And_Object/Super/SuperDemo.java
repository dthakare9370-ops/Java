class Demo{
	String name;
	int rollNo;

	Demo(String name,int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}

}
class Parent extends Demo{
	String Class;

	Parent(String Class,String name,int rollNo){
		super(name,rollNo);
		this.Class = Class;
	}

	void display(){
		System.out.println("Name of Students : "+name);
		System.out.println("RollNo : "+rollNo);
		System.out.println("Class : "+Class);
	}
}

class Client{
	public static void main(String args[]){
		Parent obj = new Parent("SE-C","Ganesh",24);
		obj.display();
	}
}






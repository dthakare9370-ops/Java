//Rule
//1.Parent Child Relation asl pahije
//2.Method Signichure same Pahije
//3.return type Same pahije Exactly
//4.In premitive used same pahije base class and derived class just like int , int // do not write first class method is int and derived class method is Float
//5.Class Covarient are allow just Like first class String second class Object






class Parent{
	void marry(){
		System.out.println("Janvhi");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Hello Constructor");
	}

/*	void marry(){
		System.out.println("Swapnali");
	}*/
	void run(){
		System.out.println("Run Method");
	}
}

class Client{
	public static void main(String args[]){
		//Parent obj1 = new Parent();
		//obj1.marry();

		//Child obj2 = new Child();
		//obj2.marry();
		
		Parent obj3 = new Child();
		// This side check Compiler == //this side decide at run time JVM

		obj3.marry();
		//Error Can not find Symbol obj3.run();

	}
}

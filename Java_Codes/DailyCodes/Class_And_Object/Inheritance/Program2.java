class Demo{
	int id;
	String name;

	/*Demo(int id, String name){
		this.id=id; //initialize
		this.name=name; //initialize
	}*/
	
	void setMethod(int id,String name){
		System.out.println(this.id); //initialize
		System.out.println(this.name);//initialize

		this.id=id; //Assignment
                this.name=name; //Assignment

		System.out.println(this.id);
                System.out.println(this.name);
	}
	void display(){
		System.out.println(id);
		System.out.println(name);
	}
}

class Program2{
	public static void main(String args[]){
		//Demo obj = new Demo(10,"Ganu");
		//obj.display();
		

		Demo obj = new Demo();
		obj.display();

	}
}

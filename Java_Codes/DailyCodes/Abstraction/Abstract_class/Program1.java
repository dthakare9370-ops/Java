//1.abstract class contain the abstact and non abstract methods
//2.if any one method is abstract in class then class will be declare as a abstract
//3.can not create the object of abstract class but its refrence is allow to used 
//4.abstract Parent class kade method jar abstract asel tar child class la ti extends hote ti tila body de nahitar class la abstract kar
//5.abstract class kade Constructor asto instace variable initilize Karnysathi
//6.abstract class cha refrence and child class cha object chalto 



abstract class Parent{
	void Education(){
		System.out.println("Docot/Engg");
	}
	abstract void marry();
}

class Child extends Parent{
	void marry(){
		System.out.println("Swapnali");
	}	
}

class client{
	public static void main(String args[]){
		Parent obj = new Child();
		obj.Education();
		obj.marry();
	}
}


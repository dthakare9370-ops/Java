//when same static method in base class and derived class then what happen 
//1.Compile time la method binding keli jatat tar tech method hy case madhe call hota runtime la decide nahi hot 
//
class Parent{
	static void fun(){
		System.out.println("Parent Fun");
	}
}


class Child extends Parent{
	
	static void fun(){
		System.out.println("Child Fun()");
	}	
}

class Client {
	public static void main(String args[]){
		//refrence = object
		Parent obj = new Child();
		//parent cha reference matter karto ya picture madhe 
		//parent cha reference chy method la call karto 
		obj.fun(); //Parent Fun 
	}
}

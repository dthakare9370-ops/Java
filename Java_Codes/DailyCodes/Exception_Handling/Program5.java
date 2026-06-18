class Demo{

	void fun(){
		System.out.println("In Fun Method ");
	}

	void run(){
		System.out.println("In run Method ");
	}

}

class Client{
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.fun();

		obj = null;

		obj.run();
	}
}

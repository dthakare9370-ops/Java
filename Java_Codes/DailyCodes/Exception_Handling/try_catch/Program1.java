
class Demo{
	static void fun(){
		System.out.println("Start Fun");
		System.out.println(10/0);
		System.out.println("End Code");
	}

	static void run(){
		System.out.println("Start Run");
		fun();
		System.out.println("End Code");
	}

	public static void main(String args[]){
		System.out.println("Start main");
		run();		
		System.out.println("End Code");
	}
}

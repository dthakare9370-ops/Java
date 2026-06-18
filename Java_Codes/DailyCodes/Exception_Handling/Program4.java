class Demo{
	static void fun(){
		System.out.println("Start");
		System.out.println(10/0);
		System.out.println("End");
	}


	public static void main(String str[]){
		fun();
	}
}

class StaticObject{
	int x = 10;
        static int y = 20;

	static{
		static int  a = 20;
		System.out.println("Static block 1");
	}
	
	StaticObject(){
		System.out.println("Constructor");
	}
	
        void fun(){
		System.out.println("In Fun Method ");
	}

	public static void main(String args[]){
		StaticObject obj = new StaticObject();
		System.out.println(obj.x);
		System.out.println(y);
		obj.fun();
	}

	static{
		System.out.println("Static Block 2");
	}
}

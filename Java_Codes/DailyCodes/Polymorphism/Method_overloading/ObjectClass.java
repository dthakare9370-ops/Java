class Demo{
	void fun(String str1){
		System.out.println("String");	
	}
	void fun(Object obj){
		System.out.println("Object Class");
	}
}

class client {
	public static void main(String args[]){
		Demo obj = new Demo();
		obj.fun("Ganu");
	      	obj.fun(new StringBuffer("Thakare"));
		obj.fun(new String("Harish"));	
		
		obj.fun(null);  //refrence is String Because it is parent of Object Class
	}
}

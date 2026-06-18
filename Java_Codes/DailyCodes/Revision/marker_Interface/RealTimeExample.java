interface Core2Web{

}

class C2W implements Core2Web{

}

class otherClass{

}

class Demo{

	public static void Interview(Object obj){
		
		if(obj instanceof C2W){
			System.out.println("Direct CEO");
		}else{
			System.out.println("5 Interview");
		}
	}

	public static void main(String args[]){
		C2W obj1 = new C2W();
		otherClass obj2 = new otherClass();

		Interview(obj1);
		Interview(obj2);
	}
}

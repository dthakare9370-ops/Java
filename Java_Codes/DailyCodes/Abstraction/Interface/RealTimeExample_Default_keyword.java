interface SujataMastani{
	default void test(){
		System.out.println("Orignal Sujata Mastani");
	}
	void price();
}

class Pune implements SujataMastani{
	public void price(){
		System.out.println("200");
	}
}

class Nashik implements SujataMastani{
	public void test(){
		System.out.println("Mix water Sujata mastani");
	}
	public void price(){
		System.out.println("100");
	}
}

class Client{
	public static void main(String args[]){

		SujataMastani locationPune = new Pune();
		SujataMastani locationNashik = new Nashik();

		locationPune.test();
		locationPune.price();

		locationNashik.test();
		locationNashik.price();
	}
}

interface SujataMastani{
	static void test(){
		System.out.println("Mango Test same in india ❤️👍");
	}
	void price();
}

class SihgadBranch implements SujataMastani{
	public void price(){
		System.out.println("200");
	}
}

class NarheBranch implements SujataMastani{
	public void price(){
		System.out.println("220");
	}
}

class Client{
	public static void main(String args[]){
		SujataMastani sihgadBranch = new SihgadBranch();
		SujataMastani narheBranch = new NarheBranch();

		SujataMastani.test();
		sihgadBranch.price();
		
		SujataMastani.test();
		narheBranch.price();
	}
}




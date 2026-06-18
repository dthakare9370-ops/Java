class ConstDemo4{
//initialize instance Variable 

	int x = 10;
	ConstDemo4(){
		System.out.println("Constructor Call");
	}

	void ConstDemo4(){
		System.out.println("Constructor Method Call ");
	}


	public static void main(String args[]){
		ConstDemo4 a = new ConstDemo4();
		a.ConstDemo4();
	}
}


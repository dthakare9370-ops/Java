class Outer{
	
	int x = 10;
	void display(){
		int y = 20;
		class Inner{
			int x = 30;
			void innDisp(){
				System.out.println("Inner - Method");
				System.out.println(Outer.this.x);
				System.out.println(this.x);
				System.out.println(y);
			}

		}
		Inner inn = new Inner();
		inn.innDisp();
	}
	
}

class client{
	public static void main(String args[]){
		Outer obj = new Outer();
		obj.display();
	}
}

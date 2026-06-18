
class Client{
	public static void main(String args[]){
		Runnable obj = new Runnable(){
			public void run(){
				System.out.println("Runnable Run Method Start");
			}
		};

		Thread t1 = new Thread(obj);
		t1.start();
	}
}


class MyThread extends Thread{

	public void run(){
		System.out.println(getName());
	}
}

class Client {
	public static void main(String args[]){
		MyThread t1 = new MyThread();
		t1.setName("Ganu");
		t1.start();


		MyThread t2 = new MyThread();
                t2.start();
		t2.setName("\thello");

	}
}

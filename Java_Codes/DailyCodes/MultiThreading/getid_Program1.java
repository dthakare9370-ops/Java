
class MyThread extends Thread{
	public void run(){
		System.out.println(getName());
		System.out.println(getId());
	}
}

class Client{
	public static void main(String args[]){
		MyThread t1 = new MyThread();
		t1.start();
		t1.setId(29);
		System.out.println(Thread.currentThread().getName());
	}
}

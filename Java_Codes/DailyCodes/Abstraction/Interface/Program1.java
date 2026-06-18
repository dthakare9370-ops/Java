//**.Interface madhe 100% abstraction ast**

//1.Interface chi .class File create hote
//2.Interface cha parent class Object class nasto
//3.Interface madhe constructor Nasto 
//4.Interface madhe 100 % abstraction ast sarv method la body naste Body dili tar Error yeto
//5.Interface madhe sarv method Public abstract rahtat
//6.we Can not create the object of interface bu used refrence to store object 
//7.class extends class          // Interface implements class            //Interface extends Interface 
//8.  // JDK 1.7 parant method la body deta yet navti pan JDK 1.8 pasun Method la body deta yete



interface Demo{
	int x =10;
	public abstract void fun();
	public abstract void run();
}

class Child implements Demo{
	public void fun(){
		System.out.println("Fun Method  : "+x);
	}

	public void run(){
		System.out.println("Run Method");
	}
}	

class Client {
	public static void main(String args[]){
		Demo obj = new Child();
		obj.fun();
		obj.run();
	}

}

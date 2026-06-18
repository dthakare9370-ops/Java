interface A{
        default void fun(){
		System.out.println("Interface A - Fun Method");
	}
}

interface B{
        static void fun(){
		System.out.println("Interface B - Fun Method");
	}
}

class Demo implements A,B{
        /*public void fun(){
                System.out.println("Fun Method of Demo Class");
        }*/
}

class Client{
        public static void main(String args[]){
                Demo obj = new Demo();
                obj.fun();
		B.fun();
        }
}

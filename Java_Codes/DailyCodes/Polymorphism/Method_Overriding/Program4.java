class Parent{
        void fun(int x){
                System.out.println("1=st Int");
        }
}

class Child extends Parent{
        void fun(int y){
                System.out.println("2= nd");            
        }
}

class Client{
        public static void main(String args[]){
                Child obj = new Parent();
		//it is wrong imcapatible type say error
                obj.fun(10);
        }
}

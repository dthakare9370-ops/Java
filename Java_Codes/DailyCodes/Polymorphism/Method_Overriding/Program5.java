class Parent{
        void fun(Object obj){
                System.out.println("Object");
        }
}

class Child extends Parent{
        void fun(String str){
                System.out.println("String");            
        }
}

class Client{
        public static void main(String args[]){
                Parent obj = new Child();
		
                obj.fun("sdfs");
		obj.fun(new Object());
        }
}

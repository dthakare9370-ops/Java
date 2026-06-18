class Parent{
        void disp(){
                System.out.println("Parent - Method ");
        }
}

class client {
        public static void main(String args[]){
                Parent obj = new Parent(){
			void disp(){
				System.out.println("Anonymose Class !!");
			}
                };
                obj.disp();

		new Parent(){

		}.disp();
		
        }
}

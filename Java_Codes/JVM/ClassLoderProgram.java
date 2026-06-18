class Demo{

}

class ClassLoderProgram{
	public static void main(String args[]){
		ClassLoader appLoder = Demo.class.getClassLoader();
		ClassLoader extLoder = appLoder.getParent();
		ClassLoader bootStrapLoder = extLoder.getParent();

		System.out.println(appLoder);
		System.out.println(extLoder);
		System.out.println(bootStrapLoder);

	}
}


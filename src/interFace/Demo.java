package interFace;

 interface Demo {
	final static int a =10;//all the variables in an interface are always public, static & final
	final int b= 20;
	
	void myData();//all the methods in an interface are by default public and abstract
	
	abstract void myData2();
	
	public void myData3();
	
	public abstract void myData4();
}
 

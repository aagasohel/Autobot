package thisKeyword;

public class Demo {
 int a = 500;
 int b = 300;
 
  Demo(int a, int b){
	  this.a = a;
	  this.b = b;
  }
  void multiplication() {
	  int res = a*b;
	  System.out.println("Multiplication ="+ res);
  }
  public static void main(String[] args) {
	Demo obj = new Demo(20,10);
	obj.multiplication();
	
}
}

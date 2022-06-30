package helloWorldExample;

public class HelloWorld {
	public void printHelloWorld(int[] a) {
		for(int b:a) {
			if((b %5 ==0) && (b% 7 ==0)) {
				System.out.println("Hello World");
				
			}
			else if(b% 5 == 0) {
				System.out.println("Hello");
				
			}
			else if(b %7 == 0) {
				System.out.println("World");
			}
		
		}
		
	}
	public static void main(String[] args) {
		int a[]= {35,2,8,5,9,2,14,35};
		HelloWorld ob1= new HelloWorld();
		ob1.printHelloWorld(a);
	}

}

package hello;

public class HelloWorld {
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }
	
	public void getSquare(int x)
	{
		float sqr=x*x;
		System.out.println("Square of the "+x+" is :" + sqr);
	}
}

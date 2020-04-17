package java_lambdas;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		Greeting helloWorldGreeting = new HelloWorldGreeting();
		Greeting innerClassGreeting = new Greeting(){
			public void perform() {
				System.out.println("Hello World!");
			}
		};		
		Greeting lambdaGreeting = () -> System.out.println("Hello World!");
		
		
		Greeter greeter = new Greeter();
		greeter.greet(helloWorldGreeting);
		greeter.greet(innerClassGreeting);
		greeter.greet(lambdaGreeting);
		
		printLambda(s -> s.length());
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	
	public static void printLambda(StringLengthLambda myLambda) {
		System.out.println(myLambda.getLength("Hello World!"));
	}

}

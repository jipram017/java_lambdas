package java_lambdas;

public class ThisReferenceExample {

	interface Test{
		void process(int i);
	}
	
	public void doProcess(int i, Test p) {
		p.process(i);
	}
	
	public void execute() {
		doProcess(10, i -> {
			System.out.println(i);
			System.out.println(this);
		});
	}
	
	public String toString() {
		return "This refers to an instance of ThisReference class";
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		/*thisReferenceExample.doProcess(10, new Test() {

			@Override
			public void process(int i) {
				System.out.println(i);
				System.out.println(this);
			}
			
			public String toString() {
				return "This refers to an instance of inner class";
			}
			
		});*/
		
		thisReferenceExample.execute();
	}

}

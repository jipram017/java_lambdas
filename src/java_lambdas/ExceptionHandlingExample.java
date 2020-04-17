package java_lambdas;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		int key = 0;	
		process(array, key, wrapperLambda((i,j) -> System.out.println(i/j)));
	}
	
	private static void process(int[] array, int num, BiConsumer<Integer, Integer> consumer) {
		for (int i : array) {
			consumer.accept(i, num);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			} catch(ArithmeticException e) {
				System.out.println("An exception occured on wrapper lambda");
		    }
		};
	}

}

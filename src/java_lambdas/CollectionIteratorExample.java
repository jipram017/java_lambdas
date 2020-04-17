package java_lambdas;

import java.util.Arrays;
import java.util.List;

public class CollectionIteratorExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Aji", "Pramono", 29),
				new Person("Werner", "Heisenberg", 30),
				new Person("Nicholas", "Terry", 23),
				new Person("Helmi", "Suharyadi", 43),
				new Person("Ferry", "Anggoro", 50)
			);
		
		System.out.println("Printing using for loop");
		for(int i = 0 ; i<people.size(); i++) {
			System.out.println(people.get(i));
		}
		
		System.out.println("Printing using for in loop");
		for (Person p : people) {
			System.out.println(p);
		}
		
		System.out.println("Printing using for each loop");
		people.forEach(System.out::println);
		
		System.out.println("Using stream");
		people.stream()
		      .filter(p -> p.getLastName().startsWith("S"))
		      .forEach(p -> System.out.println(p.getFirstName()));
	}

}

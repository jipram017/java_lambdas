package java_lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1ExerciseLambda {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Aji", "Pramono", 29),
				new Person("Werner", "Heisenberg", 30),
				new Person("Nicholas", "Terry", 23),
				new Person("Helmi", "Suharyadi", 43),
				new Person("Ferry", "Anggoro", 50)
			);
		Collections.sort(people, (p1,p2) -> p2.getLastName().compareTo(p1.getLastName()));
		printConditionally(people, p -> true, p -> System.out.println(p));
		printConditionally(people, p -> p.getLastName().startsWith("S"), p -> System.out.println(p.getFirstName()));
		printConditionally(people, p -> p.getFirstName().endsWith("i"), p -> System.out.println(p.getLastName()));
	}
	
	public static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person person : people) {
			if(predicate.test(person)) {
				consumer.accept(person);
			}
		}
	}

}

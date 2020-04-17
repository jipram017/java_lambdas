package java_lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;


public class Unit1Exercise {
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
			new Person("Aji", "Pramono", 29),
			new Person("Werner", "Heisenberg", 30),
			new Person("Nicholas", "Terry", 23),
			new Person("Helmi", "Suharyadi", 43),
			new Person("Ferry", "Anggoro", 50)
		);
		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person arg0, Person arg1) {
				return arg1.getLastName().compareTo(arg0.getLastName());
			}	
		});	
		printAll(people);
		printConditionally(people, new Predicate<Person>() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("S");
			}	
		});
	}
	
	public static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
	
	public static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for(Person person : people) {
			if(predicate.test(person)) {
				System.out.println(person);
			}
		}
	}
}

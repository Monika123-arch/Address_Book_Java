package AddressBook;

import java.util.stream.Stream;

@FunctionalInterface
public interface SortingFunction {

	Stream<Person> sort(Stream<Person> input);
}
package GuviTaskJavaAdvance;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {
		
		Stream<String> l = Stream.of("aBc","d","ef");
		
		List<String> convertUppercase = l.map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println(convertUppercase);
	}

}

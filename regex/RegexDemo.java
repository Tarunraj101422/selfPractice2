package regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RegexDemo {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 5, 3, 2, 6, 8);
		List<Integer> evenNums = li.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNums);

		List<Integer> oddNums = li.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());
		System.out.println(oddNums);

		Patient p1 = new Patient(1, "R", "Corona");
		Patient p2 = new Patient(3, "f", "fever");
		Patient p3 = new Patient(2, "t", "Corona");

		List<Patient> li2 = Arrays.asList(p1, p2, p3);

		List<Patient> corona = li2.stream().filter(p -> p.getDisease().equals("Corona")).collect(Collectors.toList());
		System.out.println(corona);

		
	}
}

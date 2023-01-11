package interviewQues;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JanInfosys {
	 public static int solution(int[] A) {
	        // Implement your solution here
		 int result = 0;
		 
	        for(int i=0; i<A.length; i++) {
	        	for(int j=i+1; j<A.length;j++) {
	        	if(A[i] < A[j]) {
	        		
	        	result = A[i];
	        	A[i] = A[j];
	        	A[j] = result;
	        	}
	        	}
	        }
	        System.out.println(result);
	        
	        return result;
	        }
	    

	public static void main(String[] args) {
	List<String> li1 = Arrays.asList("tarun","raj","abhi","","Hanuman");
	List<String> li2 = li1.stream().sorted(String::compareTo).collect(Collectors.toList());
	System.out.println(li2);
	List<String> li9 = li1.stream().filter(String -> String.length()>3).collect(Collectors.toList());
	li9.forEach(System.out::println);
	long count = li1.stream().filter(String -> String.isEmpty()).count();
	System.out.println(count);
	List<Integer> li3 = Arrays.asList(1,5,3,6,9,7,8,3,5);
	List<Integer> li4 = li3.stream().sorted(Integer::compareTo).collect(Collectors.toList());
	System.out.println("List 4"+li4);
	
	List<Integer> integers = IntStream.range(1, 100).boxed().collect(Collectors.toCollection( ArrayList::new ));
	Optional<Integer> max = integers.stream().reduce(Math::max);
	max.ifPresent(System.out::println);

	Set<Integer> li5 = li3.stream().collect(Collectors.toSet());;
	li5.forEach(System.out::println);
	
	List<Integer> li6 = li3.stream().map(n->n*n).collect(Collectors.toList());
	System.out.println(li6);
	
	List<String> li7 = li1.stream().filter(Str-> Str.isEmpty()).collect(Collectors.toList());
	li7.forEach(System.out::println);
	
	Random random = new Random();
	random.ints(1,100).limit(5).sorted().forEach(System.out::println);
	Scanner sc = new Scanner(System.in);
	/*
	 * System.out.println("Please enter num"); int num = sc.nextInt();
	 * random.ints(1,50).limit(num).forEach(System.out::println);;
	 */
	
	LocalDateTime ldt = LocalDateTime.now();
	
	Collections.sort(li3,(e1,e2) ->e1.compareTo(e2));
	int large = li3.get(li3.size()-1);
	System.out.println(large);
	
	/*System.out.println("Enter string");
	String str = sc.next();
	HashSet<Character> characterSet = new HashSet<>();
	for(char c: str.toCharArray()){
	if(characterSet.contains(c))
	System.out.println(c);*/
	
	String str2 = "tarunraj";
	HashSet<Character> characterSet = new HashSet<>();
	for(char c : str2.toCharArray()) {
		if(characterSet.contains(c)) {
			characterSet.add(c);
		}
	} System.out.println(characterSet);


	List<Integer> li10 = li3.stream().filter(n->n%2==0).collect(Collectors.toList());
	li10.forEach(System.out::println);
	} 
	}

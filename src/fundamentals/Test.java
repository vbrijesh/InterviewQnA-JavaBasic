package fundamentals;

import java.util.stream.IntStream;
import java.util.stream.Collectors;


//find missing character of alphabet(a-z or A to Z) using java8?
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abc";
		String output = IntStream.rangeClosed('a', 'z')
				  .filter(c -> input.indexOf(c) == -1)
				  .mapToObj(Character::toString)
				  .collect(Collectors.joining());
		System.out.println(output);
		
		
		String s = new String("A");
		String s1 = new String("A");
		System.out.println(s.equals(s1));

	}

}

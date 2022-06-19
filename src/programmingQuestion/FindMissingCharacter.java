package programmingQuestion;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingCharacter {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "abc";
		String output = IntStream.rangeClosed('a', 'z')
				  .filter(c -> input.indexOf(c) == -1)
				  .mapToObj(Character::toString)
				  .collect(Collectors.joining());
		System.out.println(output);

	}

}

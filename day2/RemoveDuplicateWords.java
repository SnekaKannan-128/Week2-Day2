package week2.day2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		String result = removeDuplicateWords(text);
		System.out.println(" After removing duplicate words: " + result);
		

	}
	
	private static String removeDuplicateWords(String text) {
		String[] words = text.split("\\s+");
		String result = Arrays.stream(words).distinct().collect(Collectors.joining(" "));
		
		return result;
	
	}

}

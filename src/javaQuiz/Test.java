package javaQuiz;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		
		int sum = 0;
		for (Integer num : numbers) {
			//System.out.println(num);
			
			sum = sum + num;	
		}
		System.out.println(sum);
		
	}

}

package step2;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(1, 15);
		System.out.println(numbers);
		numbers.remove(4);
		System.out.println(numbers);
		for(Object value : numbers) {
			System.out.print(value + " ");
		}
		
	}

}

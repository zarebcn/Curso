package curso;


/**
 *  Solve the exercises! :P
 */
public class LoopsExercise {

	public static void main(String[] args) {

		// We'll work with this array
		int[] numbers = { 3, 14, 2, 7, 6, 3, 7 };


		// For the exercises, suppose that you
		// don't know the numbers in the array.
		// In other words, if I change the array
		// the exercises should still be right.
		// Look at the array only to check the answers.

		// Note: I'll say "position" or "index", meaning
		//       one of the available positions/places
		//       of the array (0, 1, 2, etc.)


		
		// 1 - Display the length of the array
		//System.out.println(numbers.length);

		// 2 - Display the 3rd element in the array
		//System.out.println(numbers[2]);

		// 3 - Calculate the sum of the first and the last element (just 2 numbers)
		//int suma = numbers[0] + numbers[numbers.length-1];
		//System.out.println(suma);
		
		// 4 - Display all the numbers
		/*for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}*/

		// 5 - Display just the numbers at even positions: 14, 7, 3
		/*for (int i = 1; i <= 5; i = i + 2) {
			System.out.println(numbers[i]);
		}*/


		// 6 - Calculate the sum of all numbers
		/*int suma2 = 0;
		for (int i = 0; i < numbers.length; i++) {
			suma2 = suma2 + numbers[i];
		}
		System.out.println(suma2);*/

		// 7 - Calculate the sum of the numbers at odd positions: 3, 2, 6, 7
		/*int suma3 = 0;
		for (int i = 0; i < numbers.length; i = i + 2) {
			suma3 = suma3 + numbers[i];
		}
		System.out.println(suma3);*/

		// 8 - Calculate the average of the numbers (total sum divided by number)
		/*int average = 0;
		for (int i = 0; i < numbers.length; i++) {
			average = average + numbers[i];
		}
		System.out.println(average/numbers.length);*/

		// 9 - Find the maximum number (hint: you'll need an `if` too)
		/*int mayor = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > mayor) {
				mayor = numbers[i];
			}
		}
		System.out.println(mayor);*/
		
		// 10 - Find the minimum number
		/*int menor = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < menor) {
				menor = numbers[i];
			}
		}
		System.out.println(menor);*/
		

		// More difficult:


		// 11 - Display the number at the index indicated by the number at index 5 (what?? read again, hehe)
		/*int num = numbers[5];
		System.out.println(numbers[num]);*/


		// 12 - Find numbers whose index is the same as the number itself (what!!?? haha, read again!)
		
		/*for (int i = 0; i < numbers.length; i++) {
			int num2 = numbers[i];
			if (num2 == i){
				System.out.println(num2);
			}
		}*/


		// 13 - Swap the number at position 0 with the last number of the array.
		//      When I say "swap" I mean you have to change the positions of those
		//      numbers: move each one of them to the position of the other.
		//      Note: with `numbers[0] = XXX;` you change the first value in the array.
		/*int num3 = numbers[0];
		int num4 = numbers[numbers.length-1];
		numbers[0] = num4;
		numbers[6] = num3;*/

		// 14 - Swap the number at position 0 with the smallest value in the array
		/*int menor2 = numbers[0];
		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < menor2) {
				menor2 = numbers[i];
				index = i;
			}
		}
		
		int num4 = numbers[0];
		numbers[0] = menor2;
		numbers[index] = num4;*/

		// 15 - Given some start index swap the number at that index with the smallest
		//      number from that index. For example, if `start` is 3, find the smallest
		//      number from that index, ignoring lower indexes like 0, 1, 2.
		//      Just look from index 3 and above. Then swap the numbers.
		int start = 3;
		int menor3 = numbers[start];
		int index = 0;
		for (int i = start; i < numbers.length; i++) {
			if (numbers[i] < menor3) {
				menor3 = numbers[i];
				index = i;
			}
		}
		
		int num5 = numbers[start];
		numbers[start] = menor3;
		numbers[index] = num5;
		System.out.println(numbers[index]);


		// OK, you reached here! Even MORE difficult:


		// 16 - Find the repeated numbers (hint: you'll need a loop inside another)
		
		/*int i = 0;
		int in = 0;
		while (i < numbers.length) {
			
			
			while (in < numbers.length) {
				if (numbers[i] == numbers[in]) {
					System.out.println(numbers[i]);
				}
				in++;
			}
			i++;
			
		}*/

		/*for(int i = 0; i < numbers.length; i++) {
			 
			for(int in = i + 1; in < numbers.length; in++) {
			    	
				if(numbers[i] == numbers[in]) {
			        System.out.println(numbers[i]);
				}
			}
		}*/

		// 17 - Sort the array using the "selection sort algorithm":
		//      Start at index 0 and do what you did in exercise 15.
		//      Then move to index 1 and do the same.
		//      Then move to index 2 and do the same.
		//      When you get to the end of the array (to the last index) you're done!
		//      So, in other words, what you have to do is to repeat the process you
		//      did in ex 15 for every index in the array.
		//      https://commons.wikimedia.org/wiki/File:Selection-Sort-Animation.gif
	}
}
package curso;

import java.util.Arrays;

/**
 * Exercises about functions!
 *
 * Note: "functions" are also called "methods"
 */
public class FunctionsExercise {

	/** Ignore this function, go to run() */
	public static void main(String[] args) {
		new FunctionsExercise().run();
	}

	/**
	 * Here are the exercises
	 * define the functions below. See the bottom of the file.
	 */
	void run() {

		// 1- Define and call a function that prints "hello"
		printHello(); // (this is already solved)


		// 2- Define a function that prints "hi NAME",
		//    where NAME is the name of some person you pass as an argument.
		greets("Javi");

		// --- Good names ---
		// For the functions you have to define, think about
		// a good name for them. For example, if the function prints
		// "hi NAME" we can say it "greets" (saluda), so we can name
		// it "printGreeting" or just "greet".


		// 3- Define a function that gets 2 numbers (arguments) and
		//    returns the biggest number of them.
		System.out.println(biggest(3,7));
		
		// --- Test them ---
		// Call your functions and check they work as expected.
		// You should call them a couple of times with different arguments.


		// 4- Define a function that gets 2 numbers (base and exponent) and
		//    calculates the power of base to the exponent. For example:
		//int pow = power(2,4); // should return 16 = 2 * 2 * 2 * 2
		// Note you can also do:
		//System.out.println( power(2,4) ) ; // should print 16
		power(2,4);
		power2(8,0);

		// 5- Define a function that gets a text and a number `n`, and prints
		//    the text `n` times. Note this method doesn't return anything.
		repeatText("Hola", 3);

		// 6- Define a method that gets a text and a number `n`, and returns
		//    a text built as the concatenation of the text `n` times.
		//    For example:
		//String repeated = repeatString("bla", 3); // should return "blablabla"
		repeatText2("bla", 4);

		// 7- Define a method that gets an array of texts and returns
		//    a text built as the concatenation of all the texts.
		//    For example:
		String[] texts = {"you", "are", "amazing"};
		//String joined = joinStrings(texts); // should return "youareamazing"
		joinStrings(texts);

		// 8- Now define a similar method, but now it gets an array of texts
		//    and also another text, that will be the separator.
		//    The method returns a text built as the concatenation of all the texts,
		//    with the separator text in the middle of them.
		//    For example:
		//String joined2 = joinStrings(texts, ", "); // should return "you, are, amazing"

		// Note: in Java you can define 2 methods with the same name
		//       as long as they have different arguments (in number or type)
		joinStrings2(texts, ", ");

		// 9- Define a method that gets an array (argument)
		//    and returns the sum of all the numbers in the array.
		int[] numbers = { 1, 2, 3, 4, 5 };
		sum(numbers);

		// 10- Define a method that gets two numbers and returns true if
		//     one if them is twice (2 times) the other, in any order.
		//     Otherwise it returns false.
		//     For example:
		//boolean twice1 = oneIsTwice(4,8); // should return true
		//boolean twice2 = oneIsTwice(6,3); // should return true
		//boolean twice3 = oneIsTwice(2,8); // should return false
		// Remember you can do:
		//System.out.println( oneIsTwice(2,8) ); // should print false
		System.out.println(doubles(6,4));

		// 11- Define a method that takes two arrays and returns true if
		//     they contain the same numbers.
		int[] array1 = {1, 2 ,3};
		int[] array2 = {1, 2 ,4};
		//boolean equal = compareArrays(array1, array2); // false

		// What happens if one array is longer than the other? It should return false!
		compare(array1, array2);
		compare2(array1, array2);
	}

	/** ex1 - Prints hello */
	void printHello() {
		System.out.println("hello");
	}

	// Define your functions from here:
	void greets (String name) {
		System.out.println("Hi " + name);
	}
	
	String biggest (int num, int num2) {
		String resultado = "";
		if (num > num2) {
			resultado = "" + num;
		}
		if (num < num2) {
			resultado = "" + num2;
		}
		if (num == num2) {
			resultado = "los numeros son iguales";
		}
		return resultado;
	}
	
	int power (int num, int exp) {
		return (int)Math.pow(num, exp);
	}
	
	int power2 (int num, int exp) {
		int resultado = 1;
		for (int i = 0; i < exp; i++) {
			resultado = resultado * num;
		}
		return resultado;
	}
	
	void repeatText (String text, int num) {
		for (int i = 0; i < num; i++) {
			System.out.println(text);
		}
	}
	
	void repeatText2 (String text, int num) {
		for (int i = 0; i < num; i++) {
			System.out.print(text);
		}
		System.out.println();
	}
	
	void joinStrings (String[] texts) {
		for (int i = 0; i < texts.length; i++) {
			System.out.print(texts[i]);
		}
		System.out.println();
	}
	
	void joinStrings2 (String[] texts, String text) {
		
		String texto = "";
		for (int i = 0; i < texts.length; i++) {
			texto = texto + texts[i];
			if (i < texts.length - 1) {
				texto = texto + text;
			}	
		}
		System.out.print(texto);
		System.out.println();
	}
	
	int sum (int[] numbers) {
		int suma = 0;
		for (int i = 0; i < numbers.length; i++) {
			suma = suma + numbers[i];
		}
		return suma;
	}
	
	boolean doubles (int num, int num2) {
		if (num * 2 == num2 || num2 * 2 == num) {
			return true;
		}
		return false;
	}
	
	boolean compare (int[] array1, int[] array2) {
		return Arrays.equals(array1, array2);
	}
	
	boolean compare2 (int[] array1, int[] array2) {
		
		boolean resultado = false;
		if (array1.length == array2.length){
	        int coincide =0;
	        for (int i = 0; i < array1.length; i++){
	            if(array1[i] == array2[i])
	                coincide = coincide + 1;
	        }
	        if(coincide == array1.length)
	            resultado = true;
	    }
	    return resultado;
	}

}

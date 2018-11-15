package invertedword;

/*
 * Curso Java Intermedio #3 Youtube
 * Poninedo a prueba tu logica de programacion
 * Invertir frases
 * */

import java.util.Scanner;

public class InvertedWord {
	
	public static void main(String[] args){

		String word = "", invertedWord = "";
		int wordLength = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write a word or phrase: ");
		word = input.nextLine();
		
		wordLength = word.length(); //put the length of the input into wordLength
		
		while(wordLength != 0){
			
			invertedWord += word.substring(wordLength -1, wordLength);
		
			wordLength--;
		}
		
		System.out.println("Inverted word: "+ invertedWord);
		System.out.println("");
	}
}

//  9. Найти произведение цифр заданного четырехзначного числа.

package by.training.simplestapp.main;

import java.util.Scanner;

public class LinearApps1_09 {

	public static int numOfdig(int dig)                                             // функция определяющая количество цифр в числе dig
	{                                       
	    int count = 0;
		do { count++; } while ((dig / (int) Math.pow(10, count)) != 0);
		return count;
	}

public static void main(String args[]) {   
		System.out.println("Задайте целое число +enter");
		Scanner scan = new Scanner(System.in);                                      // пользователь вводит данные с клавиатуры
		int n = scan.nextInt();                                                     // введённые данные преобразуются в число с типом int
		if (n == 0) System.out.println("Задайте отличное от 0 число ");
		else
		{
			System.out.println("количество цифр в числе : " + numOfdig(n));         // выводим для наглядности количество цифр в исходном числе
		    int work = 1;
		    for (int i = 1; i <= numOfdig(n); i++) 
		    {
			   int num = (n % (int) Math.pow(10, i)) / (int) Math.pow(10, i - 1);   // формула каждой отдельной цифры исходного числа
			   work *= num ;
		    }
		    System.out.println("Произведение цифр заданного числа: "+work);
	    }

	}

}

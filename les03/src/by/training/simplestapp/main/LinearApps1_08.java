// 8. Написать программу, которая выводит на экран первые четыре степени числа π.

package by.training.simplestapp.main;

public class LinearApps1_08 {

	public static void main(String[] args) {
		
		int num = 4; // задайте значение степени
		int count = 1;
		
		do { 
			System.out.printf( "   π в степени %d = %.12f\n", count, Math.pow (Math.PI, count));  //    %.12f\n - задайте точноть вычисления
			count++; 
		   } 
		while ( count <= num );

	}

}

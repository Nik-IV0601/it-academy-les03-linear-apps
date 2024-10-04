// 8. Даны два числа. 
//    Найти среднее арифметическое кубов этих чисел 
//    и среднее геометрическое модулей этих чисел.

package by.training.simplestapp.main;

public class LinearApps2_08 {

	public static void main(String[] args) {

		double a = 4;
		double b  = -9;

		double c = ( Math.pow(a, 3) + Math.pow(b, 3) ) / 2;
		double d = Math.sqrt(Math.abs(a) * Math.abs(b));

		System.out.printf("среднее арифметическое кубов %f и %f = %.2f\n" 
		         + "среднее геометрическое модулей %f и %f = %.2f", a, b, c, a, b, d);
	}

}

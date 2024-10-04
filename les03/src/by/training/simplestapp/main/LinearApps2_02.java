// 2. Вычислить периметр и площадь прямоугольного треугольника 
// по длинам а и b двух катетов.

package by.training.simplestapp.main;

public class LinearApps2_02 {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 4;
		double c = Math.pow(a*a + b*b, 0.5); 
		double p = a + b + c; 
		double s = a*b/2;
		System.out.printf("Периметр треугольника = %.2f\n"
				+ "Площадь треугольника = %.2f", p, s);

	}

}

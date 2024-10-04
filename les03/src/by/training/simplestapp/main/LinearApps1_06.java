// 6. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
//   ((b + √(b^2 + 4ac)) / 2a) - (a^3)c + (b^-2)

package by.training.simplestapp.main;

public class LinearApps1_06 {

	public static void main(String[] args) {

		double a = 2.25;
		double b = 2.129;
		double c = 16.52;
		double z = ( ( b + Math.pow (Math.pow(b, 2) + 4* a * c, 0.5) ) / (2*a) ) - Math.pow(a,3) * c + Math.pow(b, -2);
		System.out.println( z );
	}

}

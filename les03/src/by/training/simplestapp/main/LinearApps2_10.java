// 10. Дана сторона равностороннего треугольника. 
//     Найти площадь этого треугольника, его высоту, 
//     радиусы вписанной и описанной окружностей.

package by.training.simplestapp.main;

public class LinearApps2_10 {

	public static void main(String[] args) {
		
		double a = 3;

		double s = Math.sqrt( 3 ) * Math.pow( a, 2 ) / 4 ;
		double h = 2 * s / a;
		double r = 2 * s / (3 * a);
		double R = Math.pow( a, 3 ) / ( 4 * s );
		
		System.out.printf("Площадь треугольника %.2f\n"
				+ "Высота треугольника %.2f\n"
				+ "Радиус вписанной окружности %.2f\n"
				+ "Радиус описанной окружности %.2f", s, h, r, R );

	}

}

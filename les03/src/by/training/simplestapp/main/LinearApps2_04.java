// 4. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3). 
//    Найти его периметр и площадь.
//    https://mathhelpplanet.com/static.php?p=onlain-reshit-treugolnik

package by.training.simplestapp.main;

public class LinearApps2_04 {

	public static void main(String[] args) {

		double х1 = 3;
		double у1 = 20;
		double x2 = 1; 
		double у2 = -6; 
		double x3 = 21; 
		double у3 = -5;
		
		double a = Math.pow( Math.pow(х1 - x2, 2) + Math.pow(у1 - у2, 2), 0.5);
		double b = Math.pow( Math.pow(x2 - x3, 2) + Math.pow(у2 - у3, 2), 0.5);
		double c = Math.pow( Math.pow(х1 - x3, 2) + Math.pow(у1 - у3, 2), 0.5);
	
		double p = a + b + c;
		double s = Math.pow(p/2 * (p/2 - a) * (p/2 - b) * (p/2 - c), 0.5) ;
		
		System.out.printf("Периметр треугольника %.2f\n"
				+ "Площадь треугольника %.2f", p, s );

	}

}

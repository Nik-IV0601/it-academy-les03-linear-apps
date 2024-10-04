//  11.  Известна длина окружности. 
//       Найти площадь круга, ограниченного этой окружностью.


package by.training.simplestapp.main;

public class LinearApps2_11 {

	public static void main(String[] args) {
		
		double c = 3;
		
		double s = Math.pow( c, 2 )/( 4 * Math.PI) ;
		
		System.out.printf("Площадь круга %.2f", s);
	}

}

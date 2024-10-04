// 3. Вычислить расстояние между двумя точками с данными координатами 
//    (х1, у1)и (x2, у2).


package by.training.simplestapp.main;

public class LinearApps2_03 {

	public static void main(String[] args) {
				
		double х1 = 3;
		double у1 = 4;
		double x2 = 1; 
		double у2 = -6; 
		double l = Math.pow( Math.pow(х1 - x2, 2) + Math.pow(у1 - у2, 2), 0.5);

		System.out.printf("расстояние между двумя точками %.3f", l );

	}

}

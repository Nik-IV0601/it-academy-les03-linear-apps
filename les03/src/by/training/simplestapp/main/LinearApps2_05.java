// 5. Вычислить длину окружности и площадь круга 
//    одного и того же заданного радиуса R.

package by.training.simplestapp.main;

public class LinearApps2_05 {

	public static void main(String[] args) {

		double R = 3;
		
		double C = 2 * R * Math.PI;
		double S = Math.PI * R * R;
		
		System.out.printf("Длина окружности %.2f\n"
				+ "Площадь круга %.2f", C, S );


	}

}

//1. Даны два действительных числа х и у. 
//Вычислить их сумму, разность, произведение и частное.


package by.training.simplestapp.main;

public class LinearApps1_01 {

	public static void main(String[] args) {
		double x = 6.2989;
		double y = 2.2195;
		double summ = x + y;
		double diff = x - y;
		double work = x * y;
		double quot = x / y;
		System.out.printf("Сумма %.3f \n"
				        + "Разность %.3f \n"
				        + "Произведение %.3f \n"
				        + "Частное %.3f \n", summ, diff, work, quot);

	}

}

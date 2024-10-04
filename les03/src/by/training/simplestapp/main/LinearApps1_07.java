// 7. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (a/c)(b/d)-(ab − c)/cd 


package by.training.simplestapp.main;

public class LinearApps1_07 {

	public static void main(String[] args) {

		double a = 2.5985;
		double b = 15.2;
		double c = 1112.008;
		double d = 45.1;
		double z = (a/c)*(b/d)-(a*b - c)/(c*d) ;
		System.out.println( z );

	}

}

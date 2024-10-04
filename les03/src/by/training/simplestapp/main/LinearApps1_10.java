// 10. Дана длина ребра куба. 
// Найти площадь грани, площадь полной поверхности и объем этого куба.

package by.training.simplestapp.main;

public class LinearApps1_10 {

	public static void main(String[] args) {
		
		int a = 5 ;
		int sGr = a*a ;
		int sAll = sGr*6 ;
		int v = sGr*a ;
		
		System.out.printf("Площадь грани %d\n"
				+ "Площадь полной поверхности %d\n"
				+ "Объем этого куба %d", sGr, sAll, v);

	}

}

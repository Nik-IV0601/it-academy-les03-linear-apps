// 4. Написать код для решения задачи. В n малых бидонах 80 л молока. 
// Сколько литров молока в m больших бидонах, 
// если в каждом большом бидоне на 12 л больше, чем в малом?

package by.training.simplestapp.main;

public class LinearApps1_04 {

	public static void main(String[] args) {
		int n = 1;                     //количество малых бидонов
		int m = 1;                     //количество больших бидонов
		int vm = ( 80 / n + 12 ) * m ;
		System.out.println( vm );

	}

}

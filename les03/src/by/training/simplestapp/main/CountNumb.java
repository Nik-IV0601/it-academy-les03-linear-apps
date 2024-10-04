package by.training.simplestapp.main;

public class CountNumb {

	public static void main(String[] args) {
		int num = 0;
		int count = 0;
		if (num == 0) 
			System.out.println("Число равно 0"); 
		do { count++; } 
		while ( ( num / (int) Math.pow(10, count) ) != 0 );
		    System.out.printf( "В числе %d количество цифр %d.", num, count );

	}

}

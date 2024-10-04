package by.training.simplestapp.main;

public class Main {

	public static void main(String[] args) {
		int num = 1_456_789_876;
	      int count = 0;
	      if (num == 0) { System.out.println("Число равно 0"); return;} 
	      do { count++; } while ((num / (int)Math.pow(10,count)) != 0);
	      System.out.printf("В числе %d - %d цифр.", num, count);

	}

}

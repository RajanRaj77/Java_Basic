package Day1_basics;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
	    sc.nextLine();
		String name;
		name = sc.nextLine();
		c = a+b;
		System.out.println("The addition value: "+c);
		System.out.println("The name of the String is: "+name);

	}

}

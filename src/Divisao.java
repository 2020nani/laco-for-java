import java.util.Scanner;

public class Divisao {
public static int num;
public static int metade;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i =1;i<=10;i++) {
		 System.out.println("Entre com um numero inteiro " );
		num=sc.nextInt();
		metade = num/2;
		System.out.println("A metade do "+ i + " numero inteiro e = " + metade);
		}
     sc.close();
	}

}

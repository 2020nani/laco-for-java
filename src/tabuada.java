import java.util.Scanner;

public class tabuada {
public static int num;
public static int tabuada;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite numero da tabuada");
		num = sc.nextInt();
		if(num>5 && num<11) {
		for(int i=1;i<11;i++) {
			tabuada=num*i;
	    	System.out.println(tabuada);
			
		}
		}else {
			System.out.println("Apenas tabuada do 6 ao 10 ");
		}
			
    sc.close();
	}

}

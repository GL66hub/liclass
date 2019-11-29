import java.util.Scanner;

public class jiejie{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		if(age<18){
			age=1;
		}
		if(age>=18){
			age=2;
		}
		switch(age){
			case 1:
				System.out.println("Ð¡½ã½ã");
				break;
			case 2:
				System.out.println("´ó½ã½ã");
				break;			
			default:
				break;
		}
	}
}
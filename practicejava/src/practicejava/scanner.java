package practicejava;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		float avg;
		int sum;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("���� ������ �Է��϶�");
		int a = input.nextInt();
		
		System.out.println("���� ������ �Է��϶�");
		int b = input.nextInt();
		
		System.out.println("���� ������ �Է��϶�");
		int c = input.nextInt();
		
		
		if(a>90){
			System.out.println("���� ������ ����Ͽɴϴ�.");
		}
		if(b>90){
			System.out.println("���� ������ ����Ͽɴϴ�.");
		}
		if(c>90){
			System.out.println("���� ������ ����Ͽɴϴ�.");
		}
		
		sum= a+b+c;
		
		System.out.println(sum);
		
//		avg = (b+a+c)/3;
//		System.out.println(avg);

	}

}

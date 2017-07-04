package practicejava;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		float avg;
		int sum;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("영어 성적을 입력하라");
		int a = input.nextInt();
		
		System.out.println("수학 성적을 입력하라");
		int b = input.nextInt();
		
		System.out.println("과학 성적을 입력하라");
		int c = input.nextInt();
		
		
		if(a>90){
			System.out.println("영어 성적이 우수하옵니다.");
		}
		if(b>90){
			System.out.println("수학 성적이 우수하옵니다.");
		}
		if(c>90){
			System.out.println("과학 성적이 우수하옵니다.");
		}
		
		sum= a+b+c;
		
		System.out.println(sum);
		
//		avg = (b+a+c)/3;
//		System.out.println(avg);

	}

}

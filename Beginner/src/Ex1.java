import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args){
		//control structure 연습 1
		//if statement
		//if(T/F expression)
		//{
		//stmt1, stmt2.....
		//} else{
		//			stmt
		//}
		
		//practice 1
		//정수형 변수 a에 값이 짝수면"입력 숫자는 짝수입니다." 응 출력
		//아니면 "입력 숫자는 홀수입니다."를 출력
//		int a =6;
//		if(a % 2 == 0){
//			System.out.println("입력 숫자는 짝수입니다");
//		} else{
//			System.out.println("입력 숫자는 홀수입니다");
//		}
		
		//practice 2
		// 수학 성적값을 받아서 
		//90점 이상이면 "Excellent"를 출력
		//89~80이면 "good"를 출력
		//79~70이면 "Average"를 출력
		//69~50이면 "Poor"를 출력
		//49점 이하면 "go home"를 출력
//		int score = 5;
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("점수를 입력하시오");
		score = input.nextInt();
				*/
//		if(score>=90){
//			System.out.println("Excellent!");
			
//		}else if(score>=80 && score<=89){
//			System.out.println("Good!");
			
//		}else if(score>=70 && score<=79){
//			System.out.println("Average");
			
//		}else if(score>=50 && score<=69){
//			System.out.println("Poor");
			
//		}else if(score<=49){
//			System.out.println("Go home");
			
//		}
		
		// logical operator
		// NOT ! ==> Unary operator
		// AND &&
		// OR ||
		
		// 입력값 받기
		// keyboard로 부터 사용자에게 입력값을 받는다.
		// keyboard에서 값을 읽어와서 Java에게 알려주는 프로그램(Scanner)을 사용한다.
		// 이 프로그램은 이미 자바네 내장되어 있어서 가져다 쓰기만 한다. --> library
		// Library를 사용할때에는 어떤 책장애서 가져오는 지를 자바에게 알려줘야 한다.
		
	/*	Scanner input = new Scanner(System.in);
		
		// input 변수에서 사용자 입력값을 읽어온다. --> String / int
		// String을 읽어오면 String에 담고. --> nextLine()을 사용
		// int를 읽어오면 int 변수에 저장한다. --> nextInt()을 사용
		
//		System.out.println("당신의 이름은 무엇입니까?");
//		String str = input.nextLine();
//		System.out.println("안녕하세요 "+str+"님 반갑습니다.");
		
		System.out.println("만원 단위의 금액을 입력하세요.");
		int money = input.nextInt();
		
		int a1, a2, b1, b2, c1, c2, d1, d2;
		
		a1 = money / 50000;
		a2 = money % 50000;
		
		b1 = a2 / 10000;
		b2 = a2 % 10000;
		
		c1 = b2 / 5000;
		c2 = b2 % 5000;
		
		d1 = c2 / 1000;
		d2 = c2 % 1000;
		
		System.out.println("5만원권 "+a1+"장");
		System.out.println("1만원권 "+b1+"장");
		System.out.println("5천원권 "+c1+"장");
		System.out.println("1천원권 "+d1+"장");
		System.out.println("나머지 "+d2);*/
//		위의 방법은 modulo를 이용한 방법으로 더 쉽게 할 수 있다.
		
/*		
 *modulo를 이용하지 않으면 더 복잡해진다. 
 
		int a = money/50000;
		int b = (money - 50000*a)/10000;
		int c = (money - 50000*a - 10000*b)/5000;
		int d = (money - 50000*a - 10000*b - 5000*c)/1000;
		int e = (money - 50000*a - 10000*b - 5000*c - 1000*d);
		
		
			System.out.println("5만원권 "+a+"장");
			System.out.println("1만원권 "+b+"장");
			System.out.println("5천원권 "+c+"장");
			System.out.println("1천원권 "+d+"장");
			System.out.println("나머지 "+e);
*/
		
		// 반복문 - 여러가지 명령어를 조건에 따라 여러번 반복시키고 싶을때 사용.
		// loop라고 한다.
		// 1. for
		// 2. while
		
		// for문
		// Syntax
		// for ( 초기조건 ; 반복 조건 ; 증감 연산자)
		// 		{
		// 			반복할 문장들;
		//		}
		
		//1부터 10까지의 숫자를 화면에 출력해 보시오
		
//		for(int i = 1; i < 7; i++)
	//	{
	//		System.out.println("*****");
	//	}
		
		//practice 2
		// nested for - double for - 이중 루프
		//for문 안에 또 for문을 사용하는것
		//구구단을 출력하시오.
/*		for(int i = 1; i < 10; i++)
		{
			System.out.println("==="+i+"단===");
			
			for(int a = 1; a < 10; a++)
			{
				System.out.println(i+ " * " +a + " = "+i*a);
				
			}
	}
	*/		
		//practice 3
/*		for(int i = 1; i < 7; i++)
		{
			for(int a = 0; a < i; a++)
			{
				System.out.print("*");
			}
		System.out.println("");
		}*/
		
		//practice 4
/*		for(int i = 7; i > 1; i--)
		{
			for(int a = 0; a < i; a++)
			{
				System.out.print(" ");
			}
			for(int b = i; b < 8; b++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		//practice 5
/*		for(int i = 1; i < 7; i++)
		{
			for(int a = 0; a < i; a++)
			{
				System.out.print(" ");
			}
			for(int b = i; b < 7; b++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}*/
		
		//practice 6
		for(int i = 7; i > 1; i--)
		{
			for(int a = 1; a < i; a++)
			{
				System.out.print("*");
			}
			for(int b = i; b < 8; b++)
			{
				System.out.print(" ");
			}
			System.out.println("");
		}
			
	}

}

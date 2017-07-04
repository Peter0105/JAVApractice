import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("첫번째 숫자");
		int a = input.nextInt();
		
		System.out.println("두번째 숫자");
		int b = input.nextInt();
		
		System.out.println("세번째 숫자");
		int c = input.nextInt();
		
		if((a + b > c) && (a + c > b) && (c + b > a)){
			System.out.println("삼각형이 되요");
		}else{
			System.out.println("삼각형이 안되요");
		}
/*		
		int t1 = b + c;
		int t2 = a + b;
		int t3 = a + c;
		
		if(a>=b && a>=c && a>t1){
			System.out.println("삼각형이 되요.");
		} else if(a>=b && a>=c && a<=t1){
			System.out.println("삼각형이 안되요");
		} else if(b>=a && b>=c && b<=t3){
			System.out.println("삼각형이 되요");
		} else if(b>=a && b>=c && b<=t3){
			System.out.println("삼각형이 안되요");
		} else if(c>=b && c>=a && c<=t2){
			System.out.println("삼각형이 되요");
		} else if(c>=b && c>=a && c<=t2){
			System.out.println("삼각형이 안되요");
		} 
		
*/
	}

}

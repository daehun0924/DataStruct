package Datastruct;
import java.util.Scanner;
class fibonachi{
public static void main(String[] args){
    long A,B;
    String choice;
    Scanner sc = new Scanner(System.in);
    System.out.println("피보나치 수열 방식을 선택하세요 1번: 재귀순환 피보나치 2번: 반복적인 피보나치");
    System.out.print("선택: ");
    choice=sc.next();

    switch(choice){
        case "1":System.out.print("num값을 입력:");
			int numA=sc.nextInt();
			A = circle_fib(numA);
			System.out.print("num번째 피보나치수열 값은:"+A);
			break;

            case "2":System.out.print("num값을 입력:");
			int numB=sc.nextInt();
			B = fib_iter(numB);
			System.out.print("num번째 피보나치수열 값은:"+B);
			break;


    } 
}
public static long circle_fib(int num){
	if (num == 0)
	{
		return 0;
	}

	if (num == 1)
	{
		return 1;
	}	
	return (circle_fib(num - 1) + circle_fib(num - 2));
}

public static long fib_iter(int num)
{
    int result=0;
	
    if (num == 0)
	{
		return 0;
	}
	if (num == 1)
	{
		return 1;
	}

	long pp = 0;
	long p = 1;

	for (int i = 2; i <= num; i++)
	{
		result = (int) (p + pp);
		pp = p;
		p = result;
	}
	return result;
}



}
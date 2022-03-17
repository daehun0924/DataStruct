package matrix;
import java.util.Scanner;
public class matrix_algo{
    public static void main(String[] args){
        int i,j=0;
        int[][] mat;
        int[][] matA;
        int choice;
        Scanner sc= new Scanner(System.in);
        mat=new int [4][4];
        matA=new int[4][4];
        for (i = 0; i <4; i++){
		for (j = 0; j <4; j++)
		{
			int num = (int)(Math.random()*999 + 1); // 1에서 999까지의 랜덤숫자 정수형 변수 num에 삽입
			mat[i][j] = num; // 정수형 변수 num을 mat에 저장
		}
	}
    System.out.println("1에서 999까지의 랜덤값으로 이루어진 mat");
    for (i = 0; i < 4; i++)
	{
		for (j = 0; j < 4; j++)
		{
            System.out.print("|"+mat[i][j]+"|");
		}
        System.out.println();
	}

    System.out.print("mat선택 1:우측 회전 2:좌측회전 3:역행렬 =>");
    choice=sc.nextInt();

    switch (choice)
	{
	case 1:
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 4; j++)
			{
				matA[j][3 - i] = mat[i][j]; //오른쪽으로 회전
			}
		}
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 4; j++)
			{
                System.out.print("|"+matA[i][j]+"|");
			}
			System.out.println();
		}


		break;

	case 2:
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 4; j++)
			{
				matA[3 - j][i] = mat[i][j]; //왼쪽으로 회전
			}
		}
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 4; j++)
			{
				System.out.print("|"+matA[i][j]+"|");
			}
			System.out.println();
		}

		break;

	case 3:
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 4; j++)
			{
				matA[j][i] = mat[i][j]; //역행렬
			}
		}
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j < 4; j++)
			{
				System.out.print("|"+matA[i][j]+"|");
			}
			System.out.println();
		}

		break;


    }
}
}










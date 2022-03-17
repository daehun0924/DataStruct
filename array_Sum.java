package sum_Array;
import java.util.Scanner;
class sum_solution {
	  public int[] solution(int[] arrA, int[] arrB) {
		// Write code here.
		  int answer[] = null;

		  int size = arrA.length + arrB.length;
		  answer = new int[size];
		  
		  int j =0;
		  for(int i=0; i<size; i++) {
			  if(i<arrA.length) {
				  answer[i] = arrA[i];
			  }else {
				  answer[i] = arrB[j];
				  j++;
			  }
		  }
		  
		  
		  for(int i=0; i<size; i++) {
			  for(int k=0; k<size; k++) {
				  if( i!= k && answer[i] < answer[k]) {
					  int temp = answer[i];
					  answer[i] = answer[k];
					  answer[k] = temp;
				  }
			  }
		  }
		  
		  
		
		  return answer;
	}
}


public class array_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A배열 크기입력: ");
        int n = sc.nextInt();
		System.out.print("B배열 크기입력: ");
        int m = sc.nextInt();
		
		sum_solution sol = new sum_solution();
       
		int[] arrA = new int[n];//A배열 생성 n크기만큼의 배열 생성
        int[] arrB = new int[m];//B배열 생성 m크기만큼의 배열 생성
		
		for(int i=0;i<n;i++)
        {
            arrA[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arrB[i] = sc.nextInt();
        }
		sc.close();


        int[] ret = sol.solution(arrA, arrB);
 
        // Press Run button to receive output.
        System.out.print("[ ");
        for(int i=0; i<ret.length; i++) {
        	System.out.print(ret[i]+" ");        	
        }
        System.out.print("]");


	}

}
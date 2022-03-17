package sum_Array;
import java.util.Scanner;
class MyArrayList {
	  public int[] ArrayList(int[] arr1, int[] arr2) {
		// Write code here.
		  int answer[] = null;

		  int size = arr1.length + arr2.length;
		  answer = new int[size];
		  
		  int j =0;
		  for(int i=0; i<size; i++) {
			  if(i<arr1.length) {
				  answer[i] = arr1[i];
			  }else {
				  answer[i] = arr2[j];
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
		System.out.print("배열1 크기입력: ");
        int n = sc.nextInt();
		System.out.print("배열2 크기입력: ");
        int m = sc.nextInt();
		
		MyArrayList sol = new MyArrayList();
       
		int[] arr1 = new int[n];//배열1 생성 n크기만큼의 배열 생성
        int[] arr2 = new int[m];//배열2 생성 m크기만큼의 배열 생성
		
		for(int i=0;i<n;i++)
        {
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            arr2[i] = sc.nextInt();
        }
		sc.close();


        int[] result = sol.ArrayList(arr1, arr2);
 
        System.out.print("[ ");
        for(int i=0; i<result.length; i++) {
        	System.out.print(result[i]+" ");        	
        }
        System.out.print("]");


	}

}
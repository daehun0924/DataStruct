package hanoi;
import java.util.Scanner;

public class hanoi_tower{
    public static void main(String[] args){
        int top=0;
        Scanner sc =new Scanner(System.in);
        System.out.print("총 원판개수를 입력하시오 = ");
        top =sc.nextInt();
        hanoitower(top, 'A', 'B', 'C');

    }

    public static void hanoitower(int n, char from, char tmp, char to){
        if (n == 1) {
            System.out.println("원판 1을"+from+"에서"+to+"까지 옮기다.");
        }
        else
        {
            hanoitower(n - 1, from, to, tmp);
            System.out.println("원판"+n+"을"+from+"에서"+to+"까지 옮긴다.");
            hanoitower(n - 1, tmp, from, to);
    }
}
}
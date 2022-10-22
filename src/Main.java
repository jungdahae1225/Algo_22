import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];
        int[] tmp = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        //arr[0]는 그대로
        tmp[0] = arr[0];
        for(int i = 1 ; i < arr.length ; i++) {
            int sum = 0;
            for(int j = 0 ; j <= i ; j++) {
                sum += arr[j];
            }
            tmp[i] = tmp[i-1] + sum;//이전까지의 누적합 + 자기자신
        }

        System.out.println(tmp[N-1]);
    }
}
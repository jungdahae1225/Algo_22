import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //입력으로 N과 K가 주어진다.
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];

        //오름차순으로 주어진다.
        for(int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        //필요한 동전 개수의 최솟값을 구하라
        StringBuilder sb = new StringBuilder();

        int count = 0;
        int tmp = 0; //나머지
        for(int i = N-1 ; i >= 0; i--) {//거꾸로 탐색한다.
            int j = K;
            count += K / arr[i];
            K = K % arr[i];
        }
        System.out.println(count);
    }
}


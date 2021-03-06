import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    /**
     * 마지막 나무가 다 자란 뒤 이장님 초대
     * 나무 묘목 n개 구입
     * 하나 심는데 1일 걸림
     * 이장님을 최대한 빨리 초대
     * 
     * 제일 오래 걸리는 거부터 심어
     * 제일 오래 걸리는 거 심는데 1일 + 4일동안 자람 [] [] [] [] []
     * [0][1][2][3][4]
     *    [0][1][2][3]
     *       [0][1][2][3]
     *          [0][1][2]
     * 심는날 + 자라는 시간 중 max + 2가 답이다.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] tree = new Integer[N];
        int sum = 1;

        for (int i = 0; i < N; i++) {
            tree[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(tree, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            if (sum < i + tree[i]) {
                sum += (i+tree[i])-sum;
            }
        }
        System.out.println(sum+2);
        sc.close();
    }
}


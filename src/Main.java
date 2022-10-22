import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long [] len = new long[N-1];//도시사이거리
        long [] pay = new long[N];//기름값

        for(int i = 0 ; i < N-1 ; i++) {
            len[i] = sc.nextInt();
        }

        for(int i = 0 ; i < N ; i++) {
            pay[i] = sc.nextInt();
        }

        long nowpay = pay[0];
        long total = (nowpay * len[0]);

        for(int i = 1 ; i < N-1 ; i++) {

            //현재 도시의 기름값이 더 싸면 그걸로.
            if(pay[i] < nowpay)
                nowpay = pay[i];

            total += (nowpay * len[i]);
        }

        System.out.print(total);
    }
}
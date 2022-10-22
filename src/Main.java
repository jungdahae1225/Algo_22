import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //입력으로 N과 K가 주어진다.
        //최대한 많은 회의를 진행하라
        int N = in.nextInt();
        int[][] arr = new int[N][2];

        //오름차순으로 주어진다.
        for(int i = 0; i < N; i++) {
            arr[i][0] = in.nextInt();//회의 시작시간
            arr[i][1] = in.nextInt();//회의 끝나는시간
        }

        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[]a, int[]b) {
                if(a[1] == b[1])
                    return a[0] - b[0];
                else
                    return a[1] - b[1];
            }
        });

        StringBuilder sb = new StringBuilder();

        int now = arr[0][1]; //현재 진행되고 있는 회의의 끝나는 시간
        int count = 1;

        for(int i = 1 ; i < arr.length ; i++) {
            //뒷 회의 시작시간이 앞 회의 끝나는 시점보다 전에 끝난다면
            if(arr[i][0] >= now) {
                now = arr[i][1];
                count++;
            }
        }
        System.out.println(count);
    }
}
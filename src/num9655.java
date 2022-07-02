import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num9655 {

    /**
     * 돌을 1개 또는 3개 가지고 갈 수 있다.
     * 마지막에 돌을 가져가는 사람이 이긴다.
     * 상근이가 먼저 시작
     * 상근이가 이기면 SK 창영이가 이기면 CY
     *
     * 입력을 1과 3으로 나눌 수 있는 경우의 수 따지기.
     * 3을 뽑거나 1을 뽑는다.
     * 순서 상관 있고 / 중복돼도 된다. -> 중복 순열
     * 5 -> 1 > 1> 1> 1> 1 || 3 -> 1 -> 1 홀수이면 무조건 상근이가 이김
     * 9 -> 1>1>1>1>1>1>1>1>1 || 3>3>3 ||3>1>1>1>1>1>1> 홀수이고 3의 배수여도 무조건 상근이가 이김
     * 6 -> 1->1>1>1>1>1> || 3 > 3 || 3 >1>1>1 짝수이고 3의 배수 이면 창영이가 이김
     * 4 -> 1>1>1>1> || 3 > 1 짝수이면 경우의 수 따져야 함
     * 8 -> 1>1>1>1>1>1>1>1 || 3>3>1>1 || 3 >1>1>1>1>1
     */

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int input = Integer.parseInt(br.readLine()); //예제 입력

            int cnt = 0;

            if(input % 2 == 1){
                System.out.print("SK");
            }
            else {
                System.out.print("CY");
            }

        }
}


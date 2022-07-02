import java.util.Scanner;
/**
 * 놓친 점. 입력 값이 정해지지 않았고 임의로 들어온다.
 * => 마지막에 들어오는 000은 이유가 있을 것. -> 종료 조건을 주는 것이다.
 * 예외를 생각할 것
 */
public class num4796 {
    static int l,p,v;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = 1;

        while(true) {
            l = sc.nextInt();
            p = sc.nextInt();
            v = sc.nextInt();

            // 0이 들어오면 종료
            if(l==0) break;
            System.out.println("Case "+tc+": "+((v/p)*l+Math.min(l,v%p)));
            tc++;
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {

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
    }
}


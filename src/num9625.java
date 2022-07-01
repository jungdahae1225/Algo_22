import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class num9625 {
    public static void main(String[] args) throws IOException {
        /**
         * 처음에는 A만 표시 되어 있다.
         * A -> B
         * B -> B A
         * A -> B -> B A ->B A B
         * B A B B A
         */
        ArrayList<String> arr= new ArrayList<>();
        arr.add("A");//맨 처음 문자는 A

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine()); //버튼을 누를 횟수
        int cntA = 0, cntB = 0;

        for(int i = 0 ; i < input ; i++){

            ArrayList<String> output= new ArrayList<>();
            for(int j = 0 ; j < arr.size() ; j++){

                if(arr.get(j).equals("A")){
                    cntA += 1;
                }
                else {
                    output.add("B");
                    output.add("A");
                }
            }
            arr.clear();
            arr = (ArrayList<String>) output.clone();
            output.clear();
        }

        for(int i = 0 ; i < arr.size(); i++){
            if(arr.get(i).equals("A"))
                cntA += 1;
            else
                cntB += 1;
        }

        System.out.print(cntA + " " + cntB);
    }
}

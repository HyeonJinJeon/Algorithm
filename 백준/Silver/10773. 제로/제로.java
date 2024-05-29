import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int money = Integer.parseInt(br.readLine());
            if (money != 0) {
                stack.push(money);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        br.close();

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        System.out.println(answer);
    }
}

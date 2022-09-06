import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        ArrayList L = new ArrayList();
        for (int i = 0; i < N; i++) {
            L.add(scanner.nextInt());
        }
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String query = scanner.next();
            if(query.equals("Insert")) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                L.add(x, y);
            } else if (query.equals("Delete")) {
                int x = scanner.nextInt();
                L.remove(x);
            }
        }
        for(int i = 0 ; i < L.size(); i++) {
            System.out.print(L.get(i) + " ");
        }



    }
}

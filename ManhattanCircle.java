import java.util.Scanner;

public class ManhattanCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        char[][] grid = new char[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // System.out.println("enter");
                grid[i][j] = sc.next().charAt(0);
            }
        }
        int max = 0;
        int r=0;
        int mid = 0;
        int row = 0;
        for( int i = 0; i < n; i++){
            int count = 0;
            for( int j = 0; j < m; j++){
                if(grid[i][j] == '#'){
                    count ++;
                    r = j;
                }
            }
            if(count> max){
                max = count;
                mid = max/2 + 1;
                if(r>max){
                   mid = mid + (r - max);
                }

                row = i+1;
            }
        }
        System.out.println(row + " " + mid);

    }
}

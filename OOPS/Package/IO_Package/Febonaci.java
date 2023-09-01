
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Test
 {
    public static void main(String[] args) {
        String filename = "fibonacci_series.txt";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any num");
		int n = sc.nextInt();

        try {
            FileWriter ob = new FileWriter(filename);
            
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                ob.write(a + " ");
                int sum = a + b;
                a = b;
                b = sum;
            }
            
            ob.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


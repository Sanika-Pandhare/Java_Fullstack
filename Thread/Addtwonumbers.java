
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Addtwonumbers {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        String s1 = null;
        String s2 = null;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number 1:");
            s1 = br.readLine();
            a = Integer.parseInt(s1);
            System.out.println("Enter number 2:");
            s2 = br.readLine();
            b = Integer.parseInt(s2);
            System.out.println("Sum = " + (a + b));

        } catch (IOException e) {
            System.out.println("Input Error");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers");
        }
    }
}
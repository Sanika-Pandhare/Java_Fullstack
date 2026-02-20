class Ex1 {

    public static void main(String[] ar) {

        try {
            String s1 = ar[0];
            String s2 = ar[1];

            System.out.println(s1 + s2);  // String concatenation

            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);

            System.out.println(a + b);    // Addition
            System.out.println(a / b);    // Division

        } catch (ArrayIndexOutOfBoundsException e1) {

            System.out.println("Please check values entered: " + e1);

        } catch (NumberFormatException e2) {

            System.out.println("Please enter numbers only: " + e2);

        } catch (ArithmeticException e3) {

            System.out.println("Please enter non-zero number: " + e3);
        }
    }
}
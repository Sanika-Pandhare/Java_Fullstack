//catch blcok hierarchy
class Ex6{
static void div(int a,int b){
System.out.println(a/b);
}
public static void main(String[] ar){
int a=0;
int b=0;
try{
 String s1=ar[0];
String s2=ar[1];
System.out.println(s1+s2);
 a=Integer.parseInt(s1);
 b=Integer.parseInt(s2);
System.out.println(a+b);
}catch(ArrayIndexOutOfBoundsException e1){

System.out.println("please enter any two values"+e1);
}
catch(NumberFormatException e2){

System.out.println("please enter only numbers"+e2);
}finally{

System.out.println("finally block reached");
}
div(a,b);
}
}


























/*


//catch block hierarchy

class Ex6 {

    public static void main(String[] ar) {
int a=0;
int b=0;

        try {
            String s1 = ar[0];
            String s2 = ar[1];

            System.out.println(s1 + s2);  // String concatenation

             a = Integer.parseInt(s1);
             b = Integer.parseInt(s2);

            System.out.println(a + b);    // Addition
            //System.out.println(a / b); 
             div(a,b); 

        } catch (ArrayIndexOutOfBoundsException e1) {

            System.out.println("Please check values entered: " + e1);

        } catch (NumberFormatException e2) {

            System.out.println("Please enter numbers only: " + e2);

        } catch (ArithmeticException e3) {

            System.out.println("Please enter non-zero number: " + e3);
        }
          finally{
          System.out.println("code comp.");


}
    }
}

*/
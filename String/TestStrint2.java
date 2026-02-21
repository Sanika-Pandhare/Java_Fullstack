// class TestStrint2{

//     public static void main(String[] args)
//     {
//         String name="someone";
//         char[] cname=name.toCharArray();
//         for(int i=0; i<=cname.length-1; i++)
//         {
//          System.out.println(cname[i]);
           
            
//         }

//     }
// }





// getchar gives four parameters

class TestStrint2 {

    public static void main(String[] args) {

        String name = "someone";

        char[] cname = name.toCharArray();

        for (int i = 0; i < cname.length; i++) {
            System.out.println(cname[i] + " -> " + Character.isLetter(cname[i]));
        }
    }
}
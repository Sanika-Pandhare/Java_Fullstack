

// import java.io.IOException;
// class Testcall{


//     public static void main(String[] args)
//     {
//         try{
//             Runtime r=Runtime.getRuntime();
//             Process p1= r.exec("calc" );
//             Process p2=r.exec("notepad");

//         }catch(Exception e)
//         {
//             System.out.println("issues calling calcultor or notepad");
//         }
//     }
// }

import java.io.IOException;

class Testcall {

    public static void main(String[] args) {

        try {
            ProcessBuilder pb1 = new ProcessBuilder("calc");
            Process p1 = pb1.start();

            ProcessBuilder pb2 = new ProcessBuilder("notepad");
            Process p2 = pb2.start();

            System.out.println("Calculator and Notepad opened successfully!");

        } catch (IOException e) {
            System.out.println("Issues calling Calculator or Notepad");
            e.printStackTrace();
        }
    }
}

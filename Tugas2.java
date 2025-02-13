/**ini merupakan pengerjaaan tugas kedua
diminta melakukan program dengan Notepad lalu 
di ubah menjadi bahsa c, dan di compile pada command prompt**/

public class Tugas2
{
    public static void main(String[] args)
    {
        String greeting = "Selamat Datang di Core Java!";
        System.out.println(greeting);
        
        for (int i = 0; i<greeting.length(); i++)
            System.out.print("=");
        System.out.println();
        
    }
}
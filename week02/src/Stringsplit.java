public class Stringsplit {
    public static void main(String[] args) {
        String s = "I@love@aluuuu";

        String [] a = s.split("@");

        for(int i= 0 ; i < a.length ; i++)
        {
            System.out.println(a[i]);
        }
    }
    
}

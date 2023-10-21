import java.util.Scanner;

public class PangramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean ans = checkPangram(str);
        System.out.println(ans);
    }

    private static boolean checkPangram(String str) {
        for (char ch = 'a';ch <= 'z';ch++){
            if(str.indexOf(ch) == -1){
                return false;
            }
        }
        return true;
    }
}

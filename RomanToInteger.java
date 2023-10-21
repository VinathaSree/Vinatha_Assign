import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        int ans = 0;
        int currValue = 0;
        int prevValue = 0;
        for(int i=roman.length()-1;i>=0;i--){
            int value = roman.charAt(i);
            switch(value){
                case 'I':
                    currValue = 1;
                    break;
                case 'V':
                    currValue = 5;
                    break;
                case 'X':
                    currValue = 10;
                    break;
                case 'L':
                    currValue = 50;
                    break;
                case 'C':
                    currValue = 100;
                    break;
                case 'D':
                    currValue = 500;
                    break;
                case 'M':
                    currValue = 1000;
                    break;
            }
            if(currValue < prevValue){
                ans -= currValue;
            }else{
                ans += currValue;
            }
            prevValue = currValue;
        }
        System.out.println(ans);
    }
}

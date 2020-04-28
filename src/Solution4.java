import java.util.Scanner;

public class Solution4 {
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int i = str.length()-1;
        int j = 0;
        char[] chars = str.toCharArray();
        while (j<j){
            while (j<i && !Character.isLetterOrDigit(chars[i])){
                i--;
            }
            while (j<i && !Character.isLetterOrDigit(chars[j])){
                j++;
            }
            if(chars[i]!=chars[j]) return false;
            i++;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println("isPinlinrome: "+ isPalindrome(str));
    }
}

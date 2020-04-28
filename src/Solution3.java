import java.util.Scanner;

public class Solution3 {
    public static String binaryAdd(String m,String n){
        int i = m.length()-1;
        int j = n.length()-1;
        StringBuilder sb = new StringBuilder();


        int carry = 0; //进一
        while (i>=0 && j>=0){
            int sum = carry; //首先累加 低位进一
            if(i>=0){
                sum += m.charAt(i--)-'0';
            }
            if(j>=0){
                sum += n.charAt(j--)-'0';
            }
            sb.append(sum %2);
            carry = sum /2;
        }

        //最高位进一
        if(carry!=0){
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String m = input.nextLine();
        String n = input.nextLine();
        System.out.println("--------");
        System.out.println(binaryAdd(m,n));
    }
}

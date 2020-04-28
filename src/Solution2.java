import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Solution2 {
    public static String longestCommonPrefix(String[] strs){
        if(strs.length==0){
            return "";
        }
        String prefix="";
        boolean broken = false;
        int i =0;
        String result;
        while (true){
            i++;
            prefix =strs[0].substring(0,i);
            result = prefix;
            for(String str : strs){
                if(!str.startsWith(prefix)) {
                    broken = true;
                }
            }
            if(broken){
                result = prefix.substring(0,i-1);
                break;
            }

        }
        return result;

    }

    public static int longestStr(String s){
        if(s==null||s.length()==0) return -1;
        s = s.trim();
        int index =s.length()-1;
        while (index>0&&s.charAt(index)!=' '){
            index--;
        }
        return s.substring(index+1,s.length()).length();

    }

    public static boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c=='[') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                else {
                    if(c==')' && stack.peek()!='(') return false;
                    if(c==']' && stack.peek()!='[') return false;
                    if(c=='}' && stack.peek()!='{') return false;
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    public static int strStr(String haystack,String needle){
        if(haystack==null || needle==null || haystack.length()<needle.length()) return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }

        return -1;
    }
    public static String binaryAdd(String n,String m){
        if(n==null || m==null) return null;
        int index = n.length()<m.length()?n.length():m.length();
        int flag=0;
        StringBuilder sb = new StringBuilder();
        while (index>0){
           if(n.charAt(index)=='1'||m.charAt(index)=='1'){
               if(flag==1){
                   sb.append(1);
               }
               flag=1;
               sb.append('0');
           }
           index--;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
//        String[] strs ={"fly","flower","floop"};
//        System.out.println(longestCommonPrefix(strs));
        Scanner input = new Scanner(System.in);
//        String haystack = input.next();
//        String needle = input.next();
//
//        System.out.println(strStr(haystack,needle));\
        String s = "Hello World";
        System.out.println(longestStr(s));

    }
}

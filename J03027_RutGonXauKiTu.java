import java.util.*;

public class J03027_RutGonXauKiTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        String s= sc.next();
        for(char x: s.toCharArray()){
            if(st.empty() || x!=st.peek()){
                st.push(x);
            }
            else st.pop();
        }
        if(!st.empty()){
            for(Character x:st){
                System.out.print(x);
            }
        }
        else {
            System.out.println("Empty String");
        }
        sc.close();
    }
}

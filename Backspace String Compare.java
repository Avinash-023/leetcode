import java.util.*;

class Main {
    public static boolean userLogic(String bob, String alice) {
        // user logic goes here
        Stack<Character> st=new Stack<>();
        for(char ch:bob.toCharArray()){
            if(ch=='#'&& !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(ch);
            }
        }
        Stack<Character> st2=new Stack<>();
        for(char ch:alice.toCharArray()){
            if(ch=='#' && !st2.isEmpty()){
                st2.pop();
            }
            else{
                st2.push(ch);
            }
        }
        String res1="";
        while(!st.isEmpty()){
            res1+=st.pop();
        }
        String res2="";
        while(!st2.isEmpty()){
            res2+=st2.pop();
        }
        return res1.equals(res2); // or false
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bob = sc.nextLine();
        String alice = sc.nextLine();
        boolean result = userLogic(bob, alice);
        System.out.println(result ? "YES" : "NO");
    }
}

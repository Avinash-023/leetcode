import java.util.Scanner;

public class Main {
    public static String transformString(String s, char ch) {
        // Write your logic here.
        int index=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==ch){
                index=i;
            }
        }
        String str=s.substring(index);
        StringBuilder sb=new StringBuilder(str);
        String res=sb.reverse().toString();
        return s.substring(0,index)+res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] data = input.split(" ");
        String s = data[0];
        char ch = data[1].charAt(0);
        
        String result = transformString(s, ch);
        System.out.println(result);
    }
}

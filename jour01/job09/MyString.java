package job09;

public class MyString {
    public static void main(String args[]){
        String str1 = "Hello world!";
        String str2 = new String("Hello world!");
        char charArray[] = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd', '!'};
        String str3 = new String(charArray);
        StringBuilder sb = new StringBuilder();
        sb.append("Hello world!");
        String str4 = sb.toString();
        System.out.println(str1 + str2 + str3 + str4);
    }
}

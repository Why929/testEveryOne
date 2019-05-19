import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        String string;
        System.out.println("请输入字符");
        Scanner scanner = new Scanner(System.in);
        string = scanner.next();
        if (isPalindrome(string.toCharArray(), 0, string.length() - 1)) {
            System.out.println("shi");
        } else {
            System.out.println("bushi");
        }
    }


    public static boolean isPalindrome(char[] str, int k, int j) {
        for (int i = k; i < str.length / 2; i++) {
            if (str[i] != str[j - i]) {
                return false;
            }else {
                return true;
            }

        }
        return false;
    }

}


import java.util.*;
public class PalindromChecker {
    String text;

    public PalindromChecker(String text){
        this.text = text;
    }

    public boolean isPalindrome(){
        String str = text.replaceAll("\\s+", "").toLowerCase();
        int length = str.length();

        for(int i=0;i<length -1 ;i++){
            if(str.charAt(i) != str.charAt(length -i -1)){
                return false;
            }
        }
        return true;
    
    }

    public void displayResult(){
        if(isPalindrome()){
            System.out.println("String is Palindrom");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
    public static void main(String[] args) {
        PalindromChecker p1 = new PalindromChecker("bhuvan");
        PalindromChecker p2 = new PalindromChecker("abba");

        p1.displayResult();
        p2.displayResult();
    }
}

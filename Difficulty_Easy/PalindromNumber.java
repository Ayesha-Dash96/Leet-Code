import java.lang.String;

class Solution {
    public boolean isPalindrome(int x) {
        String var = String.valueOf(x);
        int left = 0;
        int right = var.length() - 1;
        for(int i = 0; i < var.length() ; i++){
            if(var.charAt(left) != var.charAt(right)){
                return false;
            }
            left ++;
            right --;
        } 
        return true;
    }
}

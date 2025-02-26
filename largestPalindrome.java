public class largestPalindrome {

    static class Solution {
        int max =0, start = 0, end = 0;
        public boolean ispalindrome(String s, int i, int j){
            while(i<j){
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(j);
                if(ch1 != ch2)
                    return false;
                    i++;
                    j--;
               }
                return true;
            }
        
        public String longestPalindrome(String s) {
            int n = s.length();
            for(int i = 0; i<n; i++){
                for(int j = i; j<n; j++){
                    if(ispalindrome(s,i,j)==true){
                        if((j-i+1)>max){
                            max = j-i+1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
            return s.substring(start,end+1);
        }
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "babad";
        String result = solution.longestPalindrome(input);
        System.out.println("Longest Palindromic Substring: " + result);
    }
}




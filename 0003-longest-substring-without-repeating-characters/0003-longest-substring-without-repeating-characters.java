class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Set<Character>window=new HashSet<>();
        int left=0;
        int maxLength=0;

        for(int right=0;right< s.length();right++){
            while(window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }
                return maxLength;


    }
}
class Solution {
    public int characterReplacement(String s, int k) {

        int left=0; int  maxFreq=0; int maxWindow=0;

        int [] freq=new int[26];

        for(int right=0; right<s.length(); right++){

            // update the frequency of each charater
            freq[s.charAt(right)-'A']++;

            // now we will calculate maxfrequency
            maxFreq=Math.max(maxFreq,freq[s.charAt(right)-'A']);

            int window=right-left+1;
            
            if(window-maxFreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            window=right-left+1;
            maxWindow=Math.max(maxWindow,window);
            
        }
        return maxWindow;
        
    }
}
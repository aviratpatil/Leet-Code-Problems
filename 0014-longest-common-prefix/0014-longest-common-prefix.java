class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        // we took the first string of array string at i
        for(int i=0;i<strs[0].length();i++){
            char ch=strs[0].charAt(i);

            // we will compare first element element i with rest of the strings 
            for(int j=1; j < strs.length; j++){
                //we will compare first string's value of i with previous string 
                if(i == strs[j].length() || strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
        
    }
}
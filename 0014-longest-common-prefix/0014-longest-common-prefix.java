class Solution {
    public String longestCommonPrefix(String[] strs) {
        //make a string builder 
        StringBuilder result=new StringBuilder();
        // sort array of strings alphabetically
        Arrays.sort(strs);
        //after sorting take first string of array and convert it into Char array so that we can traverse 
        char[] first=strs[0].toCharArray();
        char[] last=strs[strs.length-1].toCharArray();
        //Start comparing first element and last element from first index and if they are similar then store into String builder 
        
        for(int i=0;i<first.length;i++){
            if(first[i]!=last[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
}
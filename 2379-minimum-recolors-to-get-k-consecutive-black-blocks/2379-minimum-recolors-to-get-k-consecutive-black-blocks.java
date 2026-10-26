class Solution {
    public int minimumRecolors(String blocks, int k) {
        int whiteCount=0;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                whiteCount++;
            }
        }
        int minRecolors=whiteCount;
        
        for(int i=k;i<blocks.length();i++){

            //Old Block leaves
            if(blocks.charAt(i-k)=='W'){
                whiteCount--;
                //this white count updates into initional variable 
            }
            //New Block added
            if(blocks.charAt(i)=='W'){
                whiteCount++;
            }
            minRecolors=Math.min(minRecolors,whiteCount);   
        }
        return minRecolors;

    }
}
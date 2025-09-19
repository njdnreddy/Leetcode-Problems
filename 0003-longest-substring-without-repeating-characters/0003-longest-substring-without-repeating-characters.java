import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> as=new ArrayList<>();  
        int count =0;
        int i=0;
        int j=0;
        while(j<s.length()){
            if(!as.contains(s.charAt(j))){
                as.add(s.charAt(j));
                j++;
                count=Math.max(count,as.size());
            }
            else{
                as.remove(Character.valueOf(s.charAt(i)));
                i++;

            }
        }  
        return count; 
    }
}
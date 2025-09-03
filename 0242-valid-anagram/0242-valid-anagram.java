import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        /*if(s.length()!=t.length()){
            return false;
        }
        int[] check=new int[26];
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        for(int i=0;i<ch1.length;i++){
            check[ch1[i]-'a']++;
        }
            for(int i=0;i<ch2.length;i++){
                if(check[ch2[i]-'a']==0){
                    return false;
                }
                check[ch2[i]-'a']--;
            }
            return true;*/
        if(s.length()!=t.length()){
            return false;
        }
        int[] count=new int[26];
        for(char c:s.toCharArray()){
            count[c-'a']++;
        }
        for(char c:t.toCharArray()){
            count[c - 'a']--;
        }
        for(int val:count){
            if(val!=0){
                return false;
            }
        }
        return true;
    }
}
    
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i=0;
        String s=strs[0];
        String s1=strs[strs.length-1];
        while(i<s.length()){
            if(s.charAt(i)==s1.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return i==0?"":s.substring(0,i);

        
    }
}
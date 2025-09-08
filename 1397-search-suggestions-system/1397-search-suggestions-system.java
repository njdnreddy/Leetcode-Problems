class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> res=new ArrayList<>();
        int n=products.length;
        int l=0,r=n-1;
        for(int i=0;i<searchWord.length();i++){
           char s=searchWord.charAt(i);
        while(l<=r&&(products[l].length()<=i||products[l].charAt(i)!=s)){
            l++;
        }
        while(l<=r&& (products[r].length()<=i||products[r].charAt(i)!=s)){
            r--;
        }
        List<String> sug=new ArrayList<>();
        int limit=Math.min(l+3,r+1);
        for(int j=l;j<limit;j++){
            sug.add(products[j]);
        }
        res.add(sug);
        
    }
    return res;
}}
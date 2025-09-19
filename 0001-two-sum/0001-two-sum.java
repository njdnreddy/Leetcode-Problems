class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int c=target-numbers[i];
            if(map.containsKey(c)){
                return new int[]{map.get(c),i};
            }
            map.put(numbers[i],i);
        }
        return new int[]{};
    }
}

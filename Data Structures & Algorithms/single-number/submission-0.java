class Solution {
    public int singleNumber(int[] nums) 
    {
    HashMap<Integer, Integer> map = new HashMap<>();

    // find the frequency of the each number

    for(int num : nums)
    {
        map.put(num,map.getOrDefault(num,0) + 1);
    }

    for (int num : nums)
    {
        if(map.get(num) == 1)
        {
            return num; 
        }
    }
       return -1; 
    }
}

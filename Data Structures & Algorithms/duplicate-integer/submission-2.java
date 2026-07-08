class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        HashSet<Integer> set = new HashSet();
        
        for (int result: nums)
        {
            if (set.contains(result))
            {
            return true;
            }
        
        set.add(result);
        }

        return false;

    }
}
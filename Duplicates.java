//Given sorted array, remove duplicates or more and return the new length

import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> diff= new HashSet<Integer>();
          int k=0;
        if(nums.length==0) return k;
        for ( int j =0; j<nums.length;++j)
        {
            if(!diff.contains(nums[j])){
            diff.add(nums[j]);
                ++k;
            }
            
        }
        return k;
   """
        int [] A= new int[nums.length]; //prevent out of bound
        for(Integer s: diff){
        //System.out.println(s);
           ++k
        }
   """

     
       
}
}

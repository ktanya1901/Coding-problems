class Solution {
    public int maxProduct(int[] nums) {
        int mul=nums[0];

        for(int i=0; i<nums.length; i++){
            int testmul=nums[i];
            if(testmul>mul)
                mul=testmul;


            for(int j=i+1; j<nums.length; j++){
                testmul=testmul*nums[j];

                if(testmul>mul)
                    mul=testmul;

            }
        }
        return mul;
    }

}
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++){
            nums1[m+i]=nums2[i];
        }
        for(int j=0; j < (m+n);j++){

            for(int k=0; k < (m+n)-j-1; k++){
                if(nums1[k+1] < nums1[k]){
                    int temp=nums1[k];
                    nums1[k]=nums1[k+1];
                    nums1[k+1]=temp;
                }
            }

        }

    }
}
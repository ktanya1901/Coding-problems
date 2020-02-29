class Solution {
    public void reverseString(char[] s) {
        int len=s.length;
        int mid=(len-(len%2))/2;
        //System.out.println(mid);
        for(int i=0; i < mid; i++){
            char temp=s[i];
            s[i]=s[len-1-i];
            s[len-1-i]=temp;
        }

    }
}
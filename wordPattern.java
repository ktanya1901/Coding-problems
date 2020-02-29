class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] words;
        words = str.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        HashMap<String,Character > map = new HashMap<>();

        for(int i=0; i < pattern.length(); i++){
            if(map.containsKey( words[i]) == false)
                if(map.containsValue(pattern.charAt(i))==false){
                    map.put(words[i], pattern.charAt(i));
                }
                else{
                    return false;
                }
            else{
                if((map.get(words[i]))!=pattern.charAt(i))
                    return false;
            }
        }

        return true;

    }
}
class Solution {
    public boolean isAnagram(String s, String t) {
        int [] charCount = new int[26];

        if(s.length() != t.length()){
            return false;
        }
        for (int i=0; i<s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for (int count : charCount){
            if (count!= 0){
                return false;
            }  
        }
        return true;
    }
}

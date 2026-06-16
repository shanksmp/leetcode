class Solution {
    public boolean isAnagram(String s, String t) {
        int [] alphabet = new int[26];
        for(int i = 0 ; i<s.length(); i++){
            int value = s.charAt(i) - 'a' ;
            alphabet[value]++;
        }
        for(int i = 0; i<t.length() ; i++){
            int value = t.charAt(i) - 'a';
            alphabet[value]--;
        }
        for(int count : alphabet){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
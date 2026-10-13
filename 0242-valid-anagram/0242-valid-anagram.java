class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[256];

        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i)]++;
        }

        for(int j = 0; j<t.length(); j++){
            count[t.charAt(j)]--;
        }

        for(int i=0; i<256; i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
    }
}
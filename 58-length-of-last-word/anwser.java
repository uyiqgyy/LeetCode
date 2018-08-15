class Solution {
    public int lengthOfLastWord(String s) {
        if( s == null) return 0;
        String result;
        String[] a = s.split(" ");
        if(a.length == 0) return 0;
        result = a[a.length - 1];
        if ( result == "") {
            return 0;
        } else {
            return result.length();
        }
        
    }
}
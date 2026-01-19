class Solution {
    public int solution(String myString, String pat) {
        String newString = myString.replace("A","C");
        newString = newString.replace("B","A");
        newString = newString.replace("C","B");
        
        return (newString.contains(pat))? 1: 0;
    }
}
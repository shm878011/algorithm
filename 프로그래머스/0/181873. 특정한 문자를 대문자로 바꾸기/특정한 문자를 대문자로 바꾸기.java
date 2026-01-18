class Solution {
    public String solution(String my_string, String alp) {
        char[] lowercase = my_string.toCharArray();
        for(int i=0; i<lowercase.length;i++){
            if(lowercase[i]==alp.charAt(0))
                lowercase[i] = Character.toUpperCase(lowercase[i]);
        }
        String answer = new String(lowercase);
        return answer;
    }
}
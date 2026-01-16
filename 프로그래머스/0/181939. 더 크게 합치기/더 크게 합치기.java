class Solution {
    public int solution(int a, int b) {
        String a1 = a+""+b;
        String b1 = b+""+a;
        int a2 = Integer.parseInt(a1);
        int b2 = Integer.parseInt(b1);
        
        return (a2>=b2) ? a2 : b2;
    }
}
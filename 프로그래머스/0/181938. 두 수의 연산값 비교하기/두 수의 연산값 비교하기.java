class Solution {
    public int solution(int a, int b) {
        String add = a+""+b;
        int add2 = Integer.parseInt(add);
        return (add2>=2*a*b)? add2: 2*a*b;
    }
}
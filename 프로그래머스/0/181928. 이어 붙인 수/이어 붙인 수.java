class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int n = num_list.length;
        int even_count = 0;
        for(int i=0; i<n ; i++){
            if(num_list[i]%2==0){
               even_count+=1;
            }
        }
        int odd_count = n-even_count;
        for(int i=0; i<n; i++){
            if(num_list[i]%2==0){
                num_list[i]*=Math.pow(10,even_count-1);
                even_count--;
                answer += num_list[i];
            }else{
                num_list[i]*=Math.pow(10,odd_count-1);
                odd_count--;
                answer+=num_list[i];
                
            }
            
        }
        return answer;
    }
}
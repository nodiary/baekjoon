class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int hol = 0;
        int jjak = 0;
        for(int num : num_list){
            if(num%2==0){
                jjak++;
            }else{
                hol++;
            }
        }
        answer[0]=jjak;
        answer[1]=hol;
        return answer;
    }
}
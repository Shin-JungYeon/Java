package programmers;

public class Exam2 {
	public static void main(String[] args) {
		Solution s = new Solution();
		String participant[] = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"mislav", "stanko", "ana"};
		System.out.println(s.solution(participant, completion));
	}
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        for(String p : participant) {
        	int cnt = 0;
            for(String c : completion) {
                if(p.equals(c)) {
                    cnt += 1;
                    System.out.println(p+","+c+","+cnt);
                }
            }
            if(cnt != 1) {
                answer = p;
            }
        }
        return answer;
    }
}

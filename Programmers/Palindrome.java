package tomorrow;

public class Palindrome {

	public static void main(String[] args) {
		String s = "abacde";
		System.out.println(solution(s));
	}

	public static int solution(String s) {
		 int max_len = 1;
	        int temp_len = 1;
	        int len = s.length();
	        // 팰린드롬 길이가 짝수일 경우
	        for(int i=0; i<len-1; i++){
	            if(s.charAt(i) == s.charAt(i+1)){ // 짝수 문자열에서 팰린드롬 기준점 선출
	                temp_len = 0;
	                for(int j=i+1; j<len; j++){
	                    try{
	                        char left = s.charAt(i+1-j+i); // left 위치선정
	                        // left 위치 선정은 약간 까다로울 수 있음.
	                        // 직접 연습장에 예시를 하나 두고 i와 j값을 변화시키며 확인해보는 것이 좋음
	                        char right = s.charAt(j);
	                        if(left == right){
	                            temp_len += 2;
	                        }else{
	                            break;
	                        }
	                    }catch(Exception e){
	                        break;
	                    }
	                }
	            }
	            if(max_len < temp_len){
	                max_len = temp_len;
	            }
	        }
	        // 팰린드롬 길이가 홀수일경우
	        for(int i=0; i<len-1; i++){
	            temp_len = 1;
	            for(int j=i-1; j>=0; j--){
	                try{
	                    char left = s.charAt(j);
	                    char right = s.charAt(i+i-j); // right 위치선정
	                    // 이 또한 직접 예시를 하나 두고 i와 j값을 변화시키며 확인해보는 것이 좋음
	                    if(left == right){
	                        temp_len += 2;
	                    }else{
	                        break;
	                    }
	                }catch(Exception e){
	                    break;
	                }
	            }
	            if(max_len < temp_len){
	                max_len = temp_len;
	            }
	        }
			return max_len;
	}
}
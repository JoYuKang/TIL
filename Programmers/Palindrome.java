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
	        // �Ӹ���� ���̰� ¦���� ���
	        for(int i=0; i<len-1; i++){
	            if(s.charAt(i) == s.charAt(i+1)){ // ¦�� ���ڿ����� �Ӹ���� ������ ����
	                temp_len = 0;
	                for(int j=i+1; j<len; j++){
	                    try{
	                        char left = s.charAt(i+1-j+i); // left ��ġ����
	                        // left ��ġ ������ �ణ ��ٷο� �� ����.
	                        // ���� �����忡 ���ø� �ϳ� �ΰ� i�� j���� ��ȭ��Ű�� Ȯ���غ��� ���� ����
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
	        // �Ӹ���� ���̰� Ȧ���ϰ��
	        for(int i=0; i<len-1; i++){
	            temp_len = 1;
	            for(int j=i-1; j>=0; j--){
	                try{
	                    char left = s.charAt(j);
	                    char right = s.charAt(i+i-j); // right ��ġ����
	                    // �� ���� ���� ���ø� �ϳ� �ΰ� i�� j���� ��ȭ��Ű�� Ȯ���غ��� ���� ����
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
package todaytest;

public class Pro_이상한문자 {
    public static void main(String[] args) {
        String s = "try hello world";
        System.out.println(solution(s));
    }

    static public StringBuilder solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sz = s.split(" ",-1);
            //split(" "), split(" ",-1) 의 차이점  
            // 0 또는 생략하면 마지막 단어에 공백(" ")가 들어가면 삭제 
            // -1을 사용하면 마지막 단어에 공백(" ")가 들어가면 삭제하지 않는다 
        for (int i = 0; i < sz.length; i++) {
            for (int j = 0; j < sz[i].length(); j++) {
                if (j % 2 == 1) {
                    answer.append(sz[i].toLowerCase().charAt(j));
                } else {
                    answer.append(sz[i].toUpperCase().charAt(j));
                }
            }if(i!=sz.length-1){
                answer.append(" ");
            }

        }

        return answer;
    }
}

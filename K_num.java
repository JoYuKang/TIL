package tomorrow;

import java.util.Arrays;

public class K_num {
	//programmers
	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] command = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

		System.out.println(Arrays.toString(solution(array, command)));
	} // 배열 자체에서 toString()을 사용하면 배열의 내용이 아니라 배열의 주소값이 출력

	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int str = commands[i][0]; // 2 4 1
			int end = commands[i][1]; // 5 4 7
			int num = commands[i][2]; // 3 1 3
			int change[] = new int[end - str + 1];
			int a = 0;
			for (int j = str - 1; j < end; j++) {
				change[a] = array[j];
				a++;
			}
			Arrays.sort(change);
			answer[i] = change[num - 1];
		}

		return answer;

	}
}
// best 
//for(int i=0; i<commands.length; i++){
//    int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//    Arrays.sort(temp);
//    answer[i] = temp[commands[i][2]-1];
//}

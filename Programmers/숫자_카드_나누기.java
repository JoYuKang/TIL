package pro;

public class 숫자_카드_나누기 {

    public static int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        int gcdA = arrayA[0];
        int gcdB = arrayB[0];
        for (int i = 1; i < arrayA.length; i++) {
            gcdA = gcd(gcdA, arrayA[i]);
            gcdB = gcd(gcdB, arrayB[i]);
        }
        if (notDivisible(arrayA, gcdB)) {
            if (answer < gcdB) {
                answer = gcdB;
            }
        }
        if (notDivisible(arrayB, gcdA)) {
            if (answer < gcdA) {
                answer = gcdA;
            }
        }

        return answer;
    }
    public static int gcd(int a, int b){
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public static boolean notDivisible(int[] arr, int num) {
        for (int i : arr) {
            if (i % num == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{10, 20},new int[]{5,17}));
    }
}

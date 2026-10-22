
import java.util.Scanner;

public class StudentScore {

    // 학생들의 평균 점수 계산
    public static double calculateAverage(int[] scores) {
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        return (double) sum / scores.length;
    }

    // 최고 점수 구하기
    public static int findMax(int[] scores) {
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"민수", "지우", "현우"};
        int[] scores = new int[3];

        // 점수 입력
        for (int i = 0; i < scores.length; i++) {
            System.out.print(names[i] + "의 점수 입력: ");
            scores[i] = sc.nextInt();
        }

        // 학생별 점수와 합격 여부 출력
        System.out.println("\n=== 학생 성적표 ===");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(names[i] + ": " + scores[i] + "점");

            if (scores[i] >= 60) {
                System.out.println("결과: 합격");
            } else {
                System.out.println("결과: 불합격");
            }
        }

        // 평균과 최고 점수 출력
        double average = calculateAverage(scores);
        int max = findMax(scores);

        System.out.println("\n평균 점수: " + average);
        System.out.println("최고 점수: " + max);

        sc.close();
    }
}


/*

    오늘 배운 내용


1. 배열
같은 자료형의 여러 값을 하나의 변수 이름으로 관리한다.
예: int[] scores = new int[3];

2. 배열의 length
배열에 들어 있는 요소의 개수를 확인할 때 사용한다.
예: scores.length

3. 반복문과 배열
for문을 사용하면 배열의 값을 차례대로 입력하거나 출력할 수 있다.

4. 메서드
특정 기능을 따로 만들어 필요할 때 호출할 수 있다.
calculateAverage()는 평균을, findMax()는 최고 점수를 구한다.

5. return
메서드에서 계산한 값을 호출한 곳으로 돌려준다.

6. 조건문
점수가 60점 이상인지 확인해 합격 여부를 구분한다.

7. Scanner
사용자가 입력한 점수를 받아 배열에 저장한다.



    복습하면서 알게 된 점

배열과 for문을 같이 사용하면 여러 학생의 점수를
반복해서 처리할 수 있다는 것을 복습했다.

평균과 최고 점수를 구하는 기능을 메서드로 나누니까
코드가 조금 더 정리되는 느낌이었다.

배열의 length를 이용하면 학생 수가 바뀌어도
반복문의 조건을 직접 수정할 필요가 줄어든다.


========================================
📌 AI 활용 복습 문제
========================================

문제 1. 배열은 어떤 용도로 사용할까?
1) 같은 자료형의 여러 값을 저장한다.
2) 프로그램을 무조건 종료한다.
3) 값을 자동으로 정렬한다.
4) 메서드를 삭제한다.

정답: 1번


문제 2. scores.length가 3이라면 무슨 뜻일까?
1) 점수의 합이 3이다.
2) 배열의 요소 개수가 3개이다.
3) 최고 점수가 3점이다.
4) 반복문이 3번 실행된 적이 있다는 뜻이다.

정답: 2번


문제 3. 다음 코드에서 sum의 최종 값은?
int sum = 0;
sum += 10;
sum += 20;

1) 10
2) 20
3) 30
4) 0

정답: 3번


문제 4. scores[i]는 무엇을 의미할까?
1) 배열의 모든 값
2) i번째 위치의 점수
3) 배열의 길이
4) 점수의 평균

정답: 2번


문제 5. 평균을 구하는 메서드에서 return을 사용하는 이유는?
1) 계산한 값을 돌려주기 위해
2) 입력을 받기 위해
3) 반복문을 시작하기 위해
4) 배열을 생성하기 위해

정답: 1번


문제 6. 최고 점수를 구할 때 max = scores[0]으로 시작하는 이유는?
1) 최고 점수를 무조건 0점으로 만들기 위해
2) 첫 번째 점수를 기준으로 비교하기 위해
3) 배열의 길이를 구하기 위해
4) 점수를 입력받기 위해

정답: 2번


문제 7. 점수가 60점일 때 결과는?
if (score >= 60) {
    System.out.println("합격");
} else {
    System.out.println("불합격");
}

1) 불합격
2) 아무것도 출력되지 않는다.
3) 합격
4) 오류가 발생한다.

정답: 3번


문제 8. 메서드로 기능을 나누면 좋은 점은?
1) 모든 코드를 한 줄로 만들 수 있다.
2) 코드를 재사용하고 기능별로 관리하기 쉽다.
3) 배열을 사용할 수 없게 된다.
4) 조건문이 필요 없어지게 된다.

정답: 2번
*/

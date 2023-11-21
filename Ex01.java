package day02;

// 1 ~ 100 까지 총합

public class Ex01 {
    public static void main(String[] args) {
        // 총합을 저장하기 위한 변수만들기
        int total;
        total = 0;
        // i가 1부터 100까지 1씩 증가하면서 반복
        //     총합에 i를 더해서 저장
        for(int i=1; i<=100; i = i + 1){
            total = total + i;
        }

        System.out.println(total);

    }
}

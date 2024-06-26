public class Scope {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true){
            int x = 20; // x 생존 시작
            System.out.println("if m = "+m);
            System.out.println("if x = "+x);
        } //x는 생존 종료.
        System.out.println("main m = "+ m);
    }//m 생존 종료
}
//지역변수는 본인의 코드 블록 안에서만 생존한다.
//이렇게 변수의 접근 가능한 범위를 '스코프(scope)라고 한다.
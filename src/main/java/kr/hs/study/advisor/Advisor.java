package kr.hs.study.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class Advisor {
    public void beforeMethod() {
        System.out.println("before advice");
    }

    public void afterMethod() {
        System.out.println("After advice");
    }

    public void aroundMethod(ProceedingJoinPoint pjp) throws Throwable{
        System.out.println("aroundMethod 앞");
        pjp.proceed(); // 원래 실행해야 할 메서드 호출(point-cut으로 지정한 애)
        System.out.println("aroundMethod 뒤");
    }

    public void afterreturningMethod() {
        System.out.println("after-returning advice");

    }

    public void afterthrowingMethod(Exception e) {
        System.out.println("after-throwing advice");

    }
}

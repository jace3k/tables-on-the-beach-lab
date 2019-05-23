package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Configuration
public class TableAspect {

    @Around("execution(* io.swagger.model.Table.setCapacity(..)) && args(capacity)")
    public void aroundSetCapacity(ProceedingJoinPoint joinPoint, Long capacity) throws Throwable {
        System.out.println("Capacity: " + capacity);
        if (capacity > 20) {
            System.out.println("Capacity is too big.");
            return;
        }
        joinPoint.proceed();
    }
}

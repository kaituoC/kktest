package vip.dreamaker.kktest.config;

import java.util.Arrays;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.MDC;
import org.springframework.context.annotation.Configuration;

/**
 * @author kaituo
 * @date 2018-11-01
 */
@Aspect
@Configuration
@Slf4j
public class SpringAOP {


  /**
   * 定义切点Pointcut 第一个*号：表示返回类型， *号表示所有的类型 第二个*号：表示类名，*号表示所有的类 第三个*号：表示方法名，*号表示所有的方法
   * 后面括弧里面表示方法的参数，两个句点表示任何参数
   */
  @Pointcut("execution(* vip.dreamaker.kktest.controller.*.*(..))")
  public void executionService() {

  }

  /**
   * 方法调用之前调用
   */
  @Before(value = "executionService()")
  public void doBefore(JoinPoint joinPoint) {
//        添加打印日志
    String requestId = String.valueOf(UUID.randomUUID());
    MDC.put("requestId", requestId);
    String className = joinPoint.getTarget().getClass().getSimpleName();
    String methodName = joinPoint.getSignature().getName();
    log.info("=====>@Before:className:[{}],methodName:[{}],请求参数为:[{}]", className, methodName,
        Arrays.toString(joinPoint.getArgs()));
  }

  /**
   * 方法之后调用
   *
   * @param returnValue 方法返回值
   */
  @AfterReturning(pointcut = "executionService()", returning = "returnValue")
  public void doAfterReturning(JoinPoint joinPoint, Object returnValue) {

    log.info("=====>@AfterReturning：响应参数为：{}", returnValue);
    // 处理完请求，返回内容
    MDC.clear();
  }

  /**
   * 统计方法执行耗时Around环绕通知
   */
  @Around("executionService()")
  public Object timeAround(ProceedingJoinPoint joinPoint) throws Throwable {

    //获取开始执行的时间
    long startTime = System.currentTimeMillis();

    // 定义返回对象、得到方法需要的参数
    Object obj = null;
    //Object[] args = joinPoint.getArgs();

    try {
      String methodName = joinPoint.getSignature().getName();
      obj = joinPoint.proceed();
    } catch (Throwable e) {
      log.error("=====>统计某方法执行耗时环绕通知出错", e);
      throw e;
    } finally {

      // 获取执行结束的时间
      long endTime = System.currentTimeMillis();
      //MethodSignature signature = (MethodSignature) joinPoint.getSignature();
      //String methodName = signature.getDeclaringTypeName() + "." + signature.getName();
      // 打印耗时的信息
      log.info("=====>处理本次请求共耗时：{} ms", endTime - startTime);
    }
    return obj;
  }

}

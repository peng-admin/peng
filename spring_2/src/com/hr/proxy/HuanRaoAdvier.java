package com.hr.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * 写的一个环绕通知对象        
 * @author hzy
 *
 */
public class HuanRaoAdvier implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("环绕--->  事务开启了");
		
		//通过反射调用方法
		Object result = invocation.proceed();
		
		
		System.out.println("环绕--->  事务结束了");
		
		return result;
	}
	

}

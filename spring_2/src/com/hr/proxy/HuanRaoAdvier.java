package com.hr.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/**
 * д��һ������֪ͨ����        
 * @author hzy
 *
 */
public class HuanRaoAdvier implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		
		System.out.println("����--->  ��������");
		
		//ͨ��������÷���
		Object result = invocation.proceed();
		
		
		System.out.println("����--->  ���������");
		
		return result;
	}
	

}

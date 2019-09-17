package com.hr.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * java反射的形式，写动态代理
 * @author hzy
 *
 */
public class TrendsProxy implements InvocationHandler{

	//这个用来接收需要被代理的目标对象
	private Object target;
	
	
	public Object bind(Object target){
		
		this.target = target;
		
		//根据传入的类对象，返回一个代理对象出去
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("日志记录");

		System.out.println("事务开启");
		
		Object result = method.invoke(this.target, args);
		
		System.out.println("事务结束");
		return result;
	}

}

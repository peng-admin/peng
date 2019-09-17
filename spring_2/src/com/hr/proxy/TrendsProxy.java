package com.hr.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * java�������ʽ��д��̬����
 * @author hzy
 *
 */
public class TrendsProxy implements InvocationHandler{

	//�������������Ҫ�������Ŀ�����
	private Object target;
	
	
	public Object bind(Object target){
		
		this.target = target;
		
		//���ݴ��������󣬷���һ����������ȥ
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		System.out.println("��־��¼");

		System.out.println("������");
		
		Object result = method.invoke(this.target, args);
		
		System.out.println("�������");
		return result;
	}

}

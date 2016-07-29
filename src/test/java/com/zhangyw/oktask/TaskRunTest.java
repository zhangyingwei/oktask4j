package com.zhangyw.oktask;

public class TaskRunTest {
	public void doSomeThing(String path,Integer num){
		System.out.println("input path:"+path+" & num:"+num);
	}
	public void doSomeThing2(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("hahahahahahahaha**************");
	}
}

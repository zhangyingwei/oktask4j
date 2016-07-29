package com.zhangyw.oktask.task;

import com.zhangyw.oktask.executer.impl.ExecuterRsp;

public interface SystemTask {
	public void doTask();
	public void doTask(ExecuterRsp rsp);
}

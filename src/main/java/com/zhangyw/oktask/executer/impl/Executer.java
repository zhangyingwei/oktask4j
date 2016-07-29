package com.zhangyw.oktask.executer.impl;

import com.zhangyw.oktask.task.impl.OkTask;

public interface Executer {
	public Executer init();
	public void execute();
	public Executer destory();
}

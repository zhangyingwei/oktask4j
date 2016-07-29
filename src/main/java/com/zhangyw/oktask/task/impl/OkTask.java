package com.zhangyw.oktask.task.impl;


import org.apache.log4j.Logger;

import com.zhangyw.oktask.common.Common;
import com.zhangyw.oktask.config.TaskConfig;
import com.zhangyw.oktask.exception.TaskTimeException;
import com.zhangyw.oktask.executer.impl.ExecuterRsp;
import com.zhangyw.oktask.task.SystemTask;
import com.zhangyw.oktask.task.Task;

public class OkTask implements SystemTask{
	private Logger logger = Logger.getLogger(OkTask.class);
	private String name;
	private TaskTime taskTime;
	private Long runTime = Common.SYSTEM_TIMESTAMP/100;
	private Long timeKey = null;
	private Task task;
	public OkTask(Task task,TaskConfig config){
		this.name = config.getName().isEmpty()?this.getDefaultTaskName():config.getName();
		this.task = task;
		try {
			this.taskTime = new TaskTime(config.getRunTiem());
			this.init();
		} catch (TaskTimeException e) {
			e.printStackTrace();
		}
	}
	public void init(){
		try {
			this.timeKey = this.taskTime.next();
		} catch (TaskTimeException e) {
			logger.info("task("+this.name+") finish");
		}
	}
	/**
	 * do next first
	 * then execute task
	 */
	public void doTask(ExecuterRsp rsp) {
		this.doTask();
		rsp.callBack();
	}
	public void doTask() {
		if(!this.taskTime.isEnd()){
			try {
				this.timeKey = this.taskTime.next();
				task.execute();
			} catch (TaskTimeException e) {
				logger.info("task("+this.name+") finish");
			}
		}
	}
	private String getDefaultTaskName(){
		return Thread.currentThread().getName();
	}
	public Long getTimeKey() {
		return this.timeKey;
	}
	public String getName() {
		return this.name;
	}
	public boolean isRun(Long runtime) {
		if(this.runTime.equals(runtime)){
			return true;
		}else{
			this.runTime = runtime;
			return false;
		}
	}
}

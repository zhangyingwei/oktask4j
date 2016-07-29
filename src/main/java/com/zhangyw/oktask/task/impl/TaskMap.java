package com.zhangyw.oktask.task.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;
import com.zhangyw.oktask.config.TaskConfig;
import com.zhangyw.oktask.task.Task;

public class TaskMap {
	private Logger logger = Logger.getLogger(TaskMap.class);
	private List<OkTask> tasks;
	private Set<Long> set = new HashSet<Long>();
	private Set<Long> useSet;
	public TaskMap(){
		this.tasks = new ArrayList<OkTask>();
	}
	public TaskMap push(Task task,TaskConfig config){
		OkTask okTask = new OkTask(task,config);
		this.push(okTask);
		return this;
	}
	private TaskMap push(OkTask task){
		this.tasks.add(task);
		set.add(task.getTimeKey());
		return this;
	}
	public List<OkTask> get(Long time){
		List<OkTask> list = new ArrayList<OkTask>();
		for(OkTask task:tasks){
			if(time.equals(task.getTimeKey())){
				list.add(task);
			}
		}
		return list;
	}
	public TaskMap reset(){
		this.tasks.clear();
		this.set.clear();
		return this;
	}
	public Set<Long> keySet(){
		if(this.useSet == null){
			this.useSet = new HashSet<Long>();
		}
		this.useSet.clear();
		for(long l:this.set){
			this.useSet.add(new Long(l));
		}
		logger.info("get key:"+this.useSet);
		return this.useSet;
	}
	
	public boolean isEmpty(){
		return this.tasks==null||this.tasks.size()==0;
	}
	
	public void reLoadKeySet(){
		this.set.clear();
		for(OkTask task:this.tasks){
			this.set.add(task.getTimeKey());
		}
		logger.info("reloadKeySet succ");
	}
}

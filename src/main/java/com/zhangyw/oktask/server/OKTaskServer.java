package com.zhangyw.oktask.server;

import com.zhangyw.oktask.config.TaskConfig;
import com.zhangyw.oktask.exception.NoTaskException;
import com.zhangyw.oktask.executer.ManageExecuter;
import com.zhangyw.oktask.task.Task;
import com.zhangyw.oktask.task.impl.TaskMap;

public class OKTaskServer {
	private TaskMap map;
	private ManageExecuter manageExecuter;
	public OKTaskServer(){
		this.map = new TaskMap();
	}
	public void start() throws NoTaskException{
		if(this.map.isEmpty()){
			throw new NoTaskException("no task");
		}else{
			new Thread(new ManageExecuter(map).setName("ManagerExecuter")).start();;
		}
	}
	public OKTaskServer submit(Task task,TaskConfig config){
		this.map.push(task, config);
		return this;
	}
}

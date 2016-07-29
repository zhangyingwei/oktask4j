package com.zhangyw.oktask.start;

import com.zhangyw.oktask.config.TaskConfig;
import com.zhangyw.oktask.exception.NoTaskException;
import com.zhangyw.oktask.executer.ManageExecuter;
import com.zhangyw.oktask.server.OKTaskServer;
import com.zhangyw.oktask.start.task.T1;
import com.zhangyw.oktask.start.task.T2;

public class Start {
	public static void main(String[] args) {
		OKTaskServer server = new OKTaskServer();
		server.submit(new T1(), new TaskConfig.Builder("T1").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T2").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T3").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T4").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T1").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T2").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T3").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T4").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T1").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T2").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T3").setRunTime("* * * * * *").build());
		server.submit(new T1(), new TaskConfig.Builder("T4").setRunTime("* * * * * *").build());
		server.submit(new T2(), new TaskConfig.Builder("T5").setRunTime("* * * * * 0").build());
		try {
			server.start();
		} catch (NoTaskException e) {
			e.printStackTrace();
		}
	}
}

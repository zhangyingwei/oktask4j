#oktask

##task.xml格式demo
```xml
<?xml version="1.0" encoding="UTF-8"?>
<name>
	<tasks>
		<task name="TaskRunTest.soSomeThing" class="com.zhangyw.oktask.TaskRunTest"  method="soSomeThing" time="* * * * * 20" >
			<params>
				<param class="java.lang.String">hello string</param>
			</params>
		</task>
	</tasks>
</name>
```

##how to start

```java
TaskConfig config = new TaskConfig();
config.setXmlPath("src/main/resources/task.xml");
new Thread(new ManageExecuter(config).setName("ManagerExecuter")).start();
```
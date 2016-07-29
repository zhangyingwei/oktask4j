#oktask

##how to start

```java
public class Start {
	public static void main(String[] args) {
		OKTaskServer server = new OKTaskServer();
		server.submit(new T1(), new TaskConfig.Builder("T1").setRunTime("* * * * * *").build());
		server.submit(new T2(), new TaskConfig.Builder("T2").setRunTime("* * * * * 0").build());
		try {
			server.start();
		} catch (NoTaskException e) {
			e.printStackTrace();
		}
	}
}
```
**注**：* * * * * *（年 月 日 时 分 秒）
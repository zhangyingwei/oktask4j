#oktask

##how to start

### T1.java
```java
public class T1 implements Task{
	@Override
	public void execute() {
		System.out.println("T1");
	}
}
```
### T2.java
```java
public class T2 implements Task{
	@Override
	public void execute() {
		System.out.println("T2");
	}
}
```

### start.java
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
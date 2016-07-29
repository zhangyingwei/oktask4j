package com.zhangyw.oktask.config;

public class TaskConfig {
	private final String name;
	private final String runTiem;
	private TaskConfig (Builder builder){
		this.name = builder.name;
		this.runTiem = builder.runTime;
	}
	public String getName() {
		return name;
	}
	public String getRunTiem() {
		return runTiem;
	}
	public static class Builder{
		private String name;
		private String runTime;
		public Builder(String name){
			this.name = name;
		}
		public Builder setName(String name){
			this.name = name;
			return this;
		}
		public Builder setRunTime(String runTime){
			this.runTime = runTime;
			return this;
		}
		public TaskConfig build(){
			return new TaskConfig(this);
		}
	}
}

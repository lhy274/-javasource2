package io;

import java.io.Serializable;

public class person implements Serializable{
	
	/**
	 * 역직렬화시 직렬화된 같은 클래스인를 판별
	 */
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String job;
	public person(String name, String job) {
		super();
		this.name = name;
		this.job = job;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", job=" + job + "]";
	}
	
	
}

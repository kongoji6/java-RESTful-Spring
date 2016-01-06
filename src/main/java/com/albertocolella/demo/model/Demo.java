package com.albertocolella.demo.model;

public class Demo {
	private final long id;
    private final String content;
    
    public Demo(long id, String content) {
        this.id = id;
        this.content = content;
    }
    
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}

}

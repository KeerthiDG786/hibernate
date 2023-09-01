package com.mob.module;

public class BusinessError {
	
	private Status status;
	
	

	public BusinessError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessError(Status status) {
		super();
		this.status = status;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	

}

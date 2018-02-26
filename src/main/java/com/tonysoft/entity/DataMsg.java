package com.tonysoft.entity;

import java.io.Serializable;

public class DataMsg extends BasicMsg implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO[] 
	*/ 
	private static final long serialVersionUID = 1L;
	
	
	private Object data = new Object();


	public Object getData() {
		return data;
	}


	public void setData(Object data) {
		this.data = data;
	}
	
	
	
}

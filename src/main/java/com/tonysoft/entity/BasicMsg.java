package com.tonysoft.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.io.Serializable;

public class BasicMsg implements Serializable{

	/** 
	* @Fields serialVersionUID : TODO[] 
	*/ 
	private static final long serialVersionUID = 1L;

	/**
	 * 操作标识符
	 */
	private boolean opState =true;

	/**
	 * 错误提示
	 */
	@JsonInclude(Include.NON_NULL) 
	private String errMsg;
	
	/**
	 * 记录行数 或者反应行数
	 */
	private int rows =0;

	public boolean isOpState() {
		return opState;
	}

	public void setOpState(boolean opState) {
		this.opState = opState;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	
	public  BasicMsg(){
		
	}
	
	public  BasicMsg(int rows){
		this.rows = rows;
	}
	
	
	public  BasicMsg(String errMsg){
		this.errMsg = errMsg;
	}
	
	public  BasicMsg(String errMsg,int rows){
		this.errMsg = errMsg;
		this.rows = rows;
	}
	
	public  BasicMsg(boolean opState,String errMsg,int rows){
		this.errMsg = errMsg;
		this.rows = rows;
		this.opState = opState;
	}
	
}

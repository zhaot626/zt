package com.mr.music1.utils;


public class ResultInfo {

	//错误码
	private  Integer  code;
	//提示信息
	private String codeInfo;
	private Object obj;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getCodeInfo() {
		return codeInfo;
	}
	public void setCodeInfo(String codeInfo) {
		this.codeInfo = codeInfo;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public ResultInfo(Integer code, String codeInfo, Object obj) {
		super();
		this.code = code;
		this.codeInfo = codeInfo;
		this.obj = obj;
	}
	public ResultInfo() {
		super();
	}
	@Override
	public String toString() {
		return "ResultInfo [code=" + code + ", codeInfo=" + codeInfo + ", obj=" + obj + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

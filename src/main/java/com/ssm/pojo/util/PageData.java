package com.ssm.pojo.util;

import java.util.ArrayList;
import java.util.List;

public class PageData {

	//数据总数
	private long total=0;
	//数据列表
	@SuppressWarnings("rawtypes")
	private List<?> rows=new ArrayList();

	
	/**
	 * @return the total
	 */
	public long getTotal() {
	
		return total;
	}

	
	/**
	 * @param total the total to set
	 */
	public void setTotal(long total) {
	
		this.total = total;
	}

	public PageData() {
		super();
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	public PageData(int total, List<?> rows) {
		super();
		this.total = total;
		this.rows = rows;
	}

	
}

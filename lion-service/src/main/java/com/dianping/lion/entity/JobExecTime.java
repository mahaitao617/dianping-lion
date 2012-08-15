/**
 * Project: lion-service
 * 
 * File Created at 2012-8-2
 * $Id$
 * 
 * Copyright 2010 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.lion.entity;

import java.util.Date;

/**
 * JobExecTime
 * @author youngphy.yang
 *
 */
public class JobExecTime {
	private int id;
	private Date lastFetchTime;
	private Date lastJobExecTime;
	private boolean swither;
	private String failMail;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getLastFetchTime() {
		return lastFetchTime;
	}
	public void setLastFetchTime(Date lastFetchTime) {
		this.lastFetchTime = lastFetchTime;
	}
	public Date getLastJobExecTime() {
		return lastJobExecTime;
	}
	public void setLastJobExecTime(Date lastJobExecTime) {
		this.lastJobExecTime = lastJobExecTime;
	}
	public boolean isSwither() {
		return swither;
	}
	public void setSwither(boolean swither) {
		this.swither = swither;
	}
	public String getFailMail() {
		return failMail;
	}
	public void setFailMail(String failMail) {
		this.failMail = failMail;
	}
	
}
package com.uhope.uip.jpa.domain;

import java.io.Serializable;
import java.util.List;

public class SynchronousData implements Serializable {

	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 8070909464821637598L;

	/**
	 * @Title:  getApplication <BR>
	 * @Description: please write your description <BR>
	 * @return: SmApplication <BR>
	 */
	public SmApplication getApplication() {
		return application;
	}

	/**
	 * @Title:  setApplication <BR>
	 * @Description: please write your description <BR>
	 * @return: SmApplication <BR>
	 */
	public void setApplication(SmApplication application) {
		this.application = application;
	}

	/**
	 * @Title:  getAppModuleList <BR>
	 * @Description: please write your description <BR>
	 * @return: List<SmApplicationModule> <BR>
	 */
	public List<SmApplicationModule> getAppModuleList() {
		return appModuleList;
	}

	/**
	 * @Title:  setAppModuleList <BR>
	 * @Description: please write your description <BR>
	 * @return: List<SmApplicationModule> <BR>
	 */
	public void setAppModuleList(List<SmApplicationModule> appModuleList) {
		this.appModuleList = appModuleList;
	}

	/**
	 * @Title:  getModuleFunctionList <BR>
	 * @Description: please write your description <BR>
	 * @return: List<SmModuleFunction> <BR>
	 */
	public List<SmModuleFunction> getModuleFunctionList() {
		return moduleFunctionList;
	}

	/**
	 * @Title:  setModuleFunctionList <BR>
	 * @Description: please write your description <BR>
	 * @return: List<SmModuleFunction> <BR>
	 */
	public void setModuleFunctionList(List<SmModuleFunction> moduleFunctionList) {
		this.moduleFunctionList = moduleFunctionList;
	}

	private SmApplication application;
	
	private List<SmApplicationModule> appModuleList;
	
	private List<SmModuleFunction> moduleFunctionList;
	
}

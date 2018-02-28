package com.uhope.uip.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**   
 * @ClassName:  SmApplicationModule
 * @Description: SmApplicationModule 主要指的是通过 模块导入的外部模块系统的描述
 * @author: yangjian
 * @date:2017年10月19日 上午10:34:12
 * @Copyright: 2017 www.uhope.com Inc. All rights reserved.
 */
@Entity
@Table(name="sm_application_module")
public class SmApplicationModule implements Serializable  {
	
    /**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 2102922428838829811L;
	
	@Id
	@Column(name="id", unique=true, nullable=false, length=32)
	private String id;
	
	/**
     * @Fields moduleId : 关联的SmApplication.id
     */
	@Column(name="appId", nullable=true, length=32)
    private String appId;
	
	@Column(name="name", nullable=false, length=50)
	private String name;
	
	@Column(name="version", nullable=false, length=32)
	private String version;
	
	@Column(name="type", nullable=false, length=3)
	private Integer type;
	
	/**
	 * @Fields serviceUrl : 提供的服务URL
	 */
	@Column(name="serviceUrl", nullable=true, length=32)
	private String serviceUrl;

	@Column(name="createTime", nullable=false)
	private Date createTime;
	
	@Column(name="lastModifyTime", nullable=true)
	private Date lastModifyTime;
	
	@Column(name="description", nullable=true, length=255)
	private String description;

	/**
	 * @Title:  getId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getId() {
		return id;
	}

	/**
	 * @Title:  setId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @Title:  getAppId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getAppId() {
		return appId;
	}

	/**
	 * @Title:  setAppId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * @Title:  getName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getName() {
		return name;
	}

	/**
	 * @Title:  setName <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @Title:  getVersion <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @Title:  setVersion <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @Title:  getServiceUrl <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getServiceUrl() {
		return serviceUrl;
	}

	/**
	 * @Title:  setServiceUrl <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	/**
	 * @Title:  getCreateTime <BR>
	 * @Description: please write your description <BR>
	 * @return: Date <BR>
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @Title:  setCreateTime <BR>
	 * @Description: please write your description <BR>
	 * @return: Date <BR>
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @Title:  getLastModifyTime <BR>
	 * @Description: please write your description <BR>
	 * @return: Date <BR>
	 */
	public Date getLastModifyTime() {
		return lastModifyTime;
	}

	/**
	 * @Title:  setLastModifyTime <BR>
	 * @Description: please write your description <BR>
	 * @return: Date <BR>
	 */
	public void setLastModifyTime(Date lastModifyTime) {
		this.lastModifyTime = lastModifyTime;
	}

	/**
	 * @Title:  getDescription <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @Title:  setDescription <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @Title:  getType <BR>
	 * @Description: please write your description <BR>
	 * @return: Integer <BR>
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @Title:  setType <BR>
	 * @Description: please write your description <BR>
	 * @return: Integer <BR>
	 */
	public void setType(Integer type) {
		this.type = type;
	}



	

	
    



}

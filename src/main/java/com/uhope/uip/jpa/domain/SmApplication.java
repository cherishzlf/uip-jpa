package com.uhope.uip.jpa.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**   
 * @ClassName:  AppFunction
 * @Description: 业务平台App描述
 * @author: yangjian
 * @date:2017年10月19日 上午10:30:23
 * @Copyright: 2017 www.uhope.com Inc. All rights reserved.
 */
@Entity
@Table(name="sm_application")
public class SmApplication implements Serializable{

	private static final long serialVersionUID = -5867608858011387626L;

	@Id
	@Column(name="id", unique=true, nullable=false, length=32)
	private String id;
	
	@Column(name="name", nullable=false, length=100)
	private String name;
	
	@Column(name="serviceUrl", nullable=false, length=255)
	private String serviceUrl;
	
	@Column(name="logoPath", nullable=true, length=255)
	private String logoPath;
	
	/**
	 * @Fields serviceHotline : 服务热线
	 */
	@Column(name="serviceHotline", nullable=true, length=200)
	private String serviceHotline;

	
	/**
	 * @Fields technicalSupport : 技术支持
	 */
	@Column(name="technicalSupport", nullable=true, length=200)
	private String technicalSupport;
	
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
	 * @Title:  getLogoPath <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getLogoPath() {
		return logoPath;
	}

	/**
	 * @Title:  setLogoPath <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}

	/**
	 * @Title:  getServiceHotline <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getServiceHotline() {
		return serviceHotline;
	}

	/**
	 * @Title:  setServiceHotline <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setServiceHotline(String serviceHotline) {
		this.serviceHotline = serviceHotline;
	}

	/**
	 * @Title:  getTechnicalSupport <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getTechnicalSupport() {
		return technicalSupport;
	}

	/**
	 * @Title:  setTechnicalSupport <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setTechnicalSupport(String technicalSupport) {
		this.technicalSupport = technicalSupport;
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
	
	
}

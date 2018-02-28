package com.uhope.uip.jpa.domain;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**   
 * @ClassName:  SmModuleFunction
 * @Description: 模块的功能列表，包含 菜单、组件、页面 三种类型的数据描述
 * @author: yangjian
 * @date:2017年10月19日 上午11:34:12
 * @Copyright: 2017 www.uhope.com Inc. All rights reserved.
 */
@Entity
@Table(name="sm_module_function")
public class SmModuleFunction implements Serializable {
	
	/**
	 * @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么)
	 */
	private static final long serialVersionUID = 3037548699092287719L;

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
	 * @Title:  getSeqId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getSeqId() {
		return seqId;
	}

	/**
	 * @Title:  setSeqId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}

	/**
	 * @Title:  getModuleId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getModuleId() {
		return moduleId;
	}

	/**
	 * @Title:  setModuleId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
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
	 * @Title:  getParentId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getParentId() {
		return parentId;
	}

	/**
	 * @Title:  setParentId <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * @Title:  getIsLeaf <BR>
	 * @Description: please write your description <BR>
	 * @return: Boolean <BR>
	 */
	public Boolean getIsLeaf() {
		return isLeaf;
	}

	/**
	 * @Title:  setIsLeaf <BR>
	 * @Description: please write your description <BR>
	 * @return: Boolean <BR>
	 */
	public void setIsLeaf(Boolean isLeaf) {
		this.isLeaf = isLeaf;
	}

	/**
	 * @Title:  getIsRoot <BR>
	 * @Description: please write your description <BR>
	 * @return: Boolean <BR>
	 */
	public Boolean getIsRoot() {
		return isRoot;
	}

	/**
	 * @Title:  setIsRoot <BR>
	 * @Description: please write your description <BR>
	 * @return: Boolean <BR>
	 */
	public void setIsRoot(Boolean isRoot) {
		this.isRoot = isRoot;
	}

	/**
	 * @Title:  getIconClass <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getIconClass() {
		return iconClass;
	}

	/**
	 * @Title:  setIconClass <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setIconClass(String iconClass) {
		this.iconClass = iconClass;
	}

	/**
	 * @Title:  getUrl <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @Title:  setUrl <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @Title:  getRequireJS <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public String getRequireJS() {
		return requireJS;
	}

	/**
	 * @Title:  setRequireJS <BR>
	 * @Description: please write your description <BR>
	 * @return: String <BR>
	 */
	public void setRequireJS(String requireJS) {
		this.requireJS = requireJS;
	}

	/**
	 * @Title:  getType <BR>
	 * @Description: please write your description <BR>
	 * @return: Character <BR>
	 */
	public Character getType() {
		return type;
	}

	/**
	 * @Title:  setType <BR>
	 * @Description: please write your description <BR>
	 * @return: Character <BR>
	 */
	public void setType(Character type) {
		this.type = type;
	}

	/**
	 * @Title:  getCreatetTime <BR>
	 * @Description: please write your description <BR>
	 * @return: Date <BR>
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @Title:  setCreatetTime <BR>
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

	@Id
	@Column(name = "id", unique = true, nullable = false, length = 32)
	private String id;

	@Column(name = "seqId", nullable = false, length = 32)
	private String seqId;

	/**
	 * @Fields moduleId : 关联的SmApplicationModule.id
	 */
	@Column(name = "moduleId", nullable = false, length = 32)
	private String moduleId;

	/**
	 * @Fields name : 功能名称，必填，不允许为空
	 */
	@Column(name = "name", nullable = false, length = 30)
	private String name;

	/**
	 * @Fields parentId : 父节点ID,可以为空
	 */
	@Column(name = "parentId", nullable = true, length = 32)
	private String parentId;

	/**
	 * @Fields isLeaf : 是否是叶子节点
	 */
	@Column(name = "isLeaf", nullable = true)
	private Boolean isLeaf;

	/**
	 * @Fields isRoot : 是否是根节点
	 */
	@Column(name = "isRoot", nullable = true)
	private Boolean isRoot;

	/**
	 * @Fields iconClass : 图标样式类名称
	 */
	@Column(name = "iconClass", nullable = true, length = 100)
	private String iconClass;

	/**
	 * @Fields url : 功能菜单对应的相对URL
	 */
	@Column(name = "url", nullable = true, length = 200)
	private String url;

	/**
	 * @Fields requireJS : 依赖的JS文件名称，相对路径+文件名称
	 */
	@Column(name = "requireJS", nullable = true, length = 1000)
	private String requireJS;

	/**
	 * @Fields type : 功能类型： 1：菜单，2：组件，3：页面
	 */
	@Column(name = "type", nullable = false, length = 1)
	private Character type;

	@Column(name = "createTime", nullable = false)
	private Date createTime;

	@Column(name = "lastModifyTime", nullable = true)
	private Date lastModifyTime;

	@Column(name = "description", nullable = true, length = 255)
	private String description;
	
}

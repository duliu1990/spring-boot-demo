/**
 * 
 */
package com.devnp.springbootsecurityformlogindemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * 用户权限角色定义：
 * 
 * 1.超级管理员 初始化账号
 * 
 * 2.普通管理员 
 * 
 * @author duliu
 *
 * 系统权限表
 */
@Entity
@Table(name="sys_role")
public class SysRole {

	@Id
	@GeneratedValue
	@Column(name="role_id")
	private Long roleId;
	
	@Column(name="role_name", length=30)
	private String roleName ;
	

	public SysRole() {
		super();
	}

	public SysRole(Long roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}

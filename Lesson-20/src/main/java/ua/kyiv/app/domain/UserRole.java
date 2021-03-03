package ua.kyiv.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_roles")
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_role_id")
	private Long userRoleId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "role")
	private String role;

	public Long getUserroleid() {
		return userRoleId;
	}

	public void setUserroleid(Long userRoleId) {
		this.userRoleId = userRoleId;
	}

	public Long getUserid() {
		return userId;
	}

	public void setUserid(Long userId) {
		this.userId = userId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

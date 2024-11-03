package com.example.cinema_client.models;
import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;
import java.util.Set;


@Data
public class User {
	private Integer id;
    @NotBlank(message = "Không được để trống email!")
    @Email(message = "Bạn cần nhập email hợp lệ!")
    private String username;

    @NotBlank(message = "Không được để trống mật khẩu!")
    @Size(min=6,message = "Mật khẩu phải có ít nhất 6 ký tự")
    private String password;

    @NotBlank(message = "Không được để trống họ tên!")
    private String fullName;
    @Size(min = 9, max = 11, message = "Số điện thoại không phù hợp")
    @NotBlank(message = "Không được để trống họ tên!")
    private String phone;
    
    private Set<Role> roles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
}
package com.mphasis.fedex.userinfo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private Integer userId;
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String email;
	private String userName;
	private Date creationDate;
	private String createdBy;
	
}

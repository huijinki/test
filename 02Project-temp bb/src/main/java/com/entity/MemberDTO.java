package com.entity;

public class MemberDTO{

	private String member_id;
	private String member_name;
	private String member_passwd;

	public String getMember_id() {
		return member_id;
	}


	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}


	public String getMember_name() {
		return member_name;
	}


	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}


	public String getMember_passwd() {
		return member_passwd;
	}


	public void setMember_passwd(String member_passwd) {
		this.member_passwd = member_passwd;
	}


	public MemberDTO() {
		super();
		System.out.println("생성");
		// TODO Auto-generated constructor stub
	}


	public MemberDTO(String member_id, String member_name, String member_passwd) {
		super();
		this.member_id = member_id;
		this.member_name = member_name;
		this.member_passwd = member_passwd;
	}


	
	
}

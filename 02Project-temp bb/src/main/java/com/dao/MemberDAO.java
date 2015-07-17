package com.dao;

import org.mybatis.spring.SqlSessionTemplate;

import com.entity.MemberDTO;

public class MemberDAO implements DAO {
	


	SqlSessionTemplate template;

	public void setTemplate(SqlSessionTemplate template) {
		this.template = template;
	}
	
	@Override
	public void write(MemberDTO dto) {
		
		System.out.println("dao");
		template.insert("register", dto);
		System.out.println("dao2");
	}

}

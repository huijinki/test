package com.service;

import com.dao.DAO;
import com.entity.MemberDTO;

public class MemberService implements MyService {

	
	DAO dao;


	public DAO getDao() {
		return dao;
	}


	public void setDao(DAO dao) {
		this.dao = dao;
	}


	@Override
	public void write(MemberDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("serivce");
		dao.write(dto);
	}
	
	
	

}

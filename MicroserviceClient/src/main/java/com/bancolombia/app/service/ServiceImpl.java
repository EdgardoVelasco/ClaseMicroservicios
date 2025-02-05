package com.bancolombia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.dao.IClientDAO;
import com.bancolombia.app.entities.Client;

@Service
public class ServiceImpl implements IService {
	
	@Autowired
	private IClientDAO dao;

	@Override
	public boolean insert(Client cl) {
		
		return dao.save(cl)!=null;
	}

	@Override
	public List<Client> selectAll() {
		
		return (List<Client>)dao.findAll();
	}

}

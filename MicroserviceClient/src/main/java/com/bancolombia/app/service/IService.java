package com.bancolombia.app.service;

import java.util.List;

import com.bancolombia.app.entities.Client;

public interface IService {
	/*return name (input)*/
	boolean insert(Client cl);
	List<Client> selectAll();
	
}

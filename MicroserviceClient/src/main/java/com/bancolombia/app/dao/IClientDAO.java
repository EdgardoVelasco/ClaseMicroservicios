package com.bancolombia.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.bancolombia.app.entities.Client;

public interface IClientDAO extends CrudRepository<Client, Long>{

}

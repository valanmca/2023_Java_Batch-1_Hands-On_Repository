package com.sms.dao;

import org.springframework.data.repository.CrudRepository;

import com.sms.bean.Songs;

public interface SongsDAO extends CrudRepository<Songs, Integer> {

}

package com.idm.t2.service;

import com.idm.t2.entity.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchDataService extends JpaRepository<UserModel, Integer> {

}

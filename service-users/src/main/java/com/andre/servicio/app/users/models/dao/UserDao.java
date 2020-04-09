package com.andre.servicio.app.users.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.andre.servicio.app.users.models.entity.UserApi;

@RepositoryRestResource(path="users")
public interface UserDao extends PagingAndSortingRepository <UserApi, Long>{

    @RestResource(path="find-username")
    public UserApi findByUsername(@Param("username") String username);
}

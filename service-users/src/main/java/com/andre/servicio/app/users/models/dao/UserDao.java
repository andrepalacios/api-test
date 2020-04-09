package com.andre.servicio.app.users.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.andre.servicio.app.users.models.entity.User;

@RepositoryRestResource(path="users")
public interface UserDao extends PagingAndSortingRepository <User, Long>{

    @RestResource(path="find-username")
    public User findByUsername(@Param("username") String username);
}

package com.sudeep.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sudeep.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {

}

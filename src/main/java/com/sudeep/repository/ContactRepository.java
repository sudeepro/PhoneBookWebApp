package com.sudeep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sudeep.entity.ContactEntity;

public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {

}

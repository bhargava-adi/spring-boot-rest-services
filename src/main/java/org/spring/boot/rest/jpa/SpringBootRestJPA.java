package org.spring.boot.rest.jpa;

import org.spring.boot.rest.entity.SpringBootRestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringBootRestJPA extends JpaRepository<SpringBootRestEntity, Integer> {

}
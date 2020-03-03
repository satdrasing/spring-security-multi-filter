package com.example.demo.repository;

import com.example.demo.entity.LogUserAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogUserAuditRepostory  extends JpaRepository<LogUserAudit, Long> {

}

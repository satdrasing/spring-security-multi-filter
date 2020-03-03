package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_audit")
public class LogUserAudit {

  public LogUserAudit(String username, long loggedTimestamp) {
    this.username = username;
    this.loggedTimestamp = loggedTimestamp;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String username;

  private long loggedTimestamp;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public long getLoggedTimestamp() {
    return loggedTimestamp;
  }

  public void setLoggedTimestamp(long loggedTimestamp) {
    this.loggedTimestamp = loggedTimestamp;
  }
}

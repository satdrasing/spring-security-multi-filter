package com.example.demo.listner;

import com.example.demo.entity.LogUserAudit;
import com.example.demo.repository.LogUserAuditRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

/**
 * This class is used for listen the event for login successful
 */
@Component
public class LoginEventListener  implements ApplicationListener<AuthenticationSuccessEvent> {

  @Autowired
  private LogUserAuditRepostory logUserAuditRepostory;

  @Override
  public void onApplicationEvent(AuthenticationSuccessEvent event) {
    String loggedUserName = ((UserDetails)event.getAuthentication().getPrincipal()).getUsername();
    long loggedTimestamp  = event.getTimestamp();
    logUserAuditRepostory.save(new LogUserAudit(loggedUserName,loggedTimestamp));
  }
}

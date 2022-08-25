package com.ae.empire.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/self/v1")
public class IdentityCtrl {

  @Value("${app.env}")
  private String env;
  
}

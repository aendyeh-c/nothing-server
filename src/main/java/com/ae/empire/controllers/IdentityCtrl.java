package com.ae.empire.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/self/v1")
public class IdentityCtrl {

  @Value("${app.env}")
  private String env;

  @GetMapping()
  public Map envGetter() {
    return Map.of(
      "env",
      env
    );
  }

}

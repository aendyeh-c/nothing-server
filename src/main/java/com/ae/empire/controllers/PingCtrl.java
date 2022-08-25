package com.ae.empire.controllers;

import com.ae.empire.models.res.GenericOkResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@Slf4j
public class PingCtrl {

  @GetMapping("/ping")
  public GenericOkResponse ping() {
    log.info("Ping received");
    return new GenericOkResponse();
  }

  @GetMapping("/kill")
  public void kill() {
    log.warn("I have decided that I want to die");
    while (true) {}
  }
}

package com.ae.empire.controllers;

import com.ae.empire.models.res.GenericOkResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
@Slf4j
public class PingCtrl {

  @GetMapping("/ping")
  public ResponseEntity<GenericOkResponse> ping() {
    log.info("Ping received");
    return GenericOkResponse.create();
  }

  @GetMapping("/kill")
  public void kill() {
    log.warn("I have decided that I want to die");
    while (true) {}
  }
}

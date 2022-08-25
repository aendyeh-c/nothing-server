package com.ae.empire.controllers;

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
  public ResponseEntity<Map> ping() {
    return ResponseEntity.ok(Map.of("status", "OK"));
  }

  @GetMapping("/kill")
  public void kill() {
    log.warn("I have decided that I want to die");
    while (true) {}
  }
}

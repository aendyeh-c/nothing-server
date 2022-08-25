package com.ae.empire.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PingCtrl {

  @GetMapping("/ping")
  public ResponseEntity<Map> ping() {
    return ResponseEntity.ok(Map.of("status", "OK"));
  }
}

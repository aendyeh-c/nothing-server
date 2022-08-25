package com.ae.empire.models.res;

import lombok.Getter;
import org.springframework.http.ResponseEntity;

public class GenericOkResponse {

  @Getter
  private final String status = "OK";

}

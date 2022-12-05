package com.github.nut077.springkafka.controller;

import com.github.nut077.springkafka.entity.LibraryEvent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1")
public class LibraryEventController {

  @PostMapping("/library-event")
  public ResponseEntity<LibraryEvent> createEvent(@RequestBody LibraryEvent req) {
    return ResponseEntity.status(HttpStatus.CREATED).body(req);
  }
}

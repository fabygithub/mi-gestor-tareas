package com.tuempresa.tuapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @GetMapping("/")
  public String home() {
    return "Gestor de tareas OK. Prueba /api/ping";
  }

  @GetMapping("/api/ping")
  public String ping() {
    return "OK";
  }
}

package net.royalsystems.hola2.hola;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

  @GetMapping("/hola")
  String hello() {
    return "Hola";
  }
  
}

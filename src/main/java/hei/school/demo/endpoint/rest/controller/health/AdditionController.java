package hei.school.demo.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
  @GetMapping("/add")
  public long addition(@RequestParam long a, @RequestParam long b) {
    return a + b;
  }
}

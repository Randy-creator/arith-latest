package test;

import static org.junit.Assert.assertEquals;

import hei.school.demo.endpoint.rest.controller.health.AdditionController;
import org.junit.jupiter.api.Test;

public class additonTest {
  private final AdditionController subject = new AdditionController();

  @Test
  void additionTest() {
    assertEquals(3, subject.addition(1, 2));
  }
}

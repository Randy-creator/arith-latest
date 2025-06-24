package test;

import hei.school.demo.endpoint.rest.controller.health.AdditionController;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class additonTest {
  private final AdditionController subject = new AdditionController();

  @Test
  void additionTest() {
    assertEquals(3, subject.addition(1, 2));
  }

  @Test
  void addition_no_overflow() {
    assertEquals(3_000_000_000l, subject.addition(1_000_000_000, 2_000_000__000));
  }
}

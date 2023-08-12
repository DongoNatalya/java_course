package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance1() {
    Point p = new Point(10, 5, 12, 30);
    Assert.assertEquals( p.distance(),  25.079872407968907);
  }
}

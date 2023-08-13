package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance1() {
    Point p1 = new Point(10, 5);
    Point p2 = new Point(15,8 );
    Assert.assertEquals( p1.distance(p2),  5.830951894845301);
  }
}

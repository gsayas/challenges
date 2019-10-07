import org.junit.Assert;
import org.junit.Test;

public class NextGreatStringTest {

  @Test
  public void testBasicCase() {

    NextGreatString ngs = new NextGreatString();

    Assert.assertEquals("bac", ngs.getSolution("acb"));

  }

}

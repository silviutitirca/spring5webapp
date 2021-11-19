package guru.springframework.spring5webapp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Spring5webappApplicationTests {

	public static String i1;
	public static String i2;
	public static String i3;
	public static String i4;
	public static String i5;

	@Test
	public void contextLoads() {

		Assert.assertEquals(1,1);
		Assert.assertEquals(1,1);
		Assert.assertEquals(1,1);
		Assert.assertEquals(1,1);
		Assert.assertEquals(1,1);
	}

}

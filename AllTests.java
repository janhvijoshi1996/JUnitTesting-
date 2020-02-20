package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Circle_AreaTest.class, Cube_AreaTest.class, Cuboid_AreaTest.class, Rectangle_AreaTest.class,
		Square_AreaTest.class, triangle_AreaTest.class })
public class AllTests {

}

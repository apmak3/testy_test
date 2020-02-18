package pizza;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PizzaTestA.class, PizzaTestB.class, PizzaTestC.class, PizzaTestD.class })
public class AllTests {

}

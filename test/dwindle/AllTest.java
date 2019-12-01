package dwindle;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
/**
 *
 * @author Israel
 */

@RunWith(Suite.class)
@SuiteClasses({EventDeckTest.class, EventMechanicsTest.class, GameOverTest.class, ScavengeMechanicsTest.class, StatsTest.class})
public class AllTest {}


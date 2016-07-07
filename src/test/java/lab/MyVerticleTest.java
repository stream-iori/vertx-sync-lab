package lab;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.Async;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.RunTestOnContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by stream.
 */
@RunWith(VertxUnitRunner.class)
public class MyVerticleTest {

  @Rule
  public RunTestOnContext rule = new RunTestOnContext();

  @Test
  public void lab(TestContext context) {
    Async async = context.async();
    Vertx vertx = rule.vertx();
    vertx.deployVerticle(new MyVerticle());
    //async.complete();
  }

}

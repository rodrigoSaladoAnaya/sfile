package sfile.client;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

public class Client extends AbstractVerticle {

  Logger log = LoggerFactory.getLogger(this.getClass());

  @Override
  public void start() {
    log.info("Client test.....");
  }
}

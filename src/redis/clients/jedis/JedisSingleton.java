package redis.clients.jedis;

public class JedisSingleton {

  private JedisSingleton() {}

  private static class JedisSingletonHolder {
    private static final Jedis INSTANCE = new Jedis();
  }

  public static Jedis getInstance() {
    Jedis INSTANCE = JedisSingletonHolder.INSTANCE;
    return JedisSingletonHolder.INSTANCE;
  }

}

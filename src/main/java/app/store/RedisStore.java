
package app.store;

import redis.clients.jedis.Jedis;
import app.model.Student;
import com.google.gson.Gson;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class RedisStore {
    static Jedis jedis;
    static Gson gson = new Gson();

    public static void init() {
        jedis = new Jedis("localhost", 6379); // IP ve PORT burada
        jedis = new Jedis("redis", 6379); // IP ve PORT burada
    }

    public static void put(String key, Student student){
        String json = gson.toJson(student);
        jedis.set(key, json);
    }

    public static Student get(String id) {
        String json = jedis.get(id);
        return gson.fromJson(json, Student.class);
    }
}

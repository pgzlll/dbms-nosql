
package app.store;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import app.model.Student;

public class HazelcastStore {
    static HazelcastInstance hz;
    static IMap<String, Student> map;

    public static void init() {

        if (hz != null) return;

        ClientConfig config = new ClientConfig();
        config.getNetworkConfig().addAddress("hazelcast:5701");
        config.getNetworkConfig().addAddress("hazelcast:5703");
        config.getNetworkConfig().addAddress("hazelcast:5704");
        config.getNetworkConfig().addAddress("hazelcast:5705");


        hz = HazelcastClient.newHazelcastClient(config); // config dosyasına bağlanır
        map = hz.getMap("ogrenciler");

        for (int i = 0; i < 10000; i++) {
            String id = "2025" + String.format("%06d", i);
            Student s = new Student(id, "Ad Soyad " + i, "Bilgisayar");
            map.put(id, s);
        }
    }

    public static void put(String key, Student student){
        map.put(key, student);
    }

    public static Student get(String id) {
        return map.get(id);
    }
}

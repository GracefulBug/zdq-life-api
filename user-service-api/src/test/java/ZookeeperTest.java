import org.apache.zookeeper.*;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class ZookeeperTest {

    ZooKeeper zkClient;

    @Before
    public void init() throws IOException {
         zkClient = new ZooKeeper("120.221.160.123:2181", 5000, new Watcher() {
            @Override
            public void process(WatchedEvent watchedEvent) {
                System.out.println("监听到节点发送变化");

            }
        });
    }

    @Test
    public void createNode() throws KeeperException, InterruptedException {
        String node = zkClient.create("/family", "jiating".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);
        System.out.println(node);
    }

    @Test
    public void existNode() throws KeeperException, InterruptedException {
        Stat exists = zkClient.exists("/family", false);
    }
}

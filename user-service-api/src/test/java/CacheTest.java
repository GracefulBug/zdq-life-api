import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.NodeCache;
import org.apache.curator.framework.recipes.cache.NodeCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.junit.Test;

public class CacheTest {

    static String Path = "/zk-curator/nodeCache";


    CuratorFramework curatorFramework;

    public CacheTest() {
        curatorFramework = CuratorFrameworkFactory.builder().connectString("120.221.160.123:2181").retryPolicy(new ExponentialBackoffRetry(1000, 3)).build();
    }

    @Test
    public void nodeCacheTest() throws Exception {
        curatorFramework.start();
        curatorFramework.create().creatingParentContainersIfNeeded().withMode(CreateMode.EPHEMERAL).forPath(Path, "init".getBytes());

        new NodeCache()
    }
}

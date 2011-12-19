/**
 * 
 */
package waheed.demo.pojo.json.tutorial.using.jetison;

/**
 * @author abdul
 *
 */

/**
 * Contains data configuration for an individual tenant.
 * 
 * @author aycherny
 * 
 */

public class TenantConfig {


    public TenantConfig(){
    }


    private ClusterConfig clusterConfig;
    private String id;
    private String name;
    private int webPort;
    private boolean started;

    /**
     * @return the started
     */
    public boolean isStarted() {
        return started;
    }

    /**
     * @param started the started to set
     */
    public void setStarted(boolean started) {
        this.started = started;
    }



    /**
     * Cluster settings.
     * 
     * @return cluster settings
     */
    public ClusterConfig getClusterConfig() {
        return clusterConfig;
    }

    /**
     * Unique tenant ID
     * 
     * @return tenant ID
     */
    public String getId() {
        return id;
    }


    public String getName() {
        return this.name;
    }

    /**
     * Tenant management web port.
     * 
     * @return web port
     */
    public int getWebPort() {
        return webPort;
    }

    public void setClusterConfig(ClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWebPort(int webPort) {
        this.webPort = webPort;
    }

}

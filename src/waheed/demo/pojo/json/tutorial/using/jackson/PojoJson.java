/**
 * 
 */
package waheed.demo.pojo.json.tutorial.using.jackson;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import waheed.demo.pojo.json.tutorial.using.jetison.ClusterConfig;
import waheed.demo.pojo.json.tutorial.using.jetison.DummyConfig;



/**
 * Conversion POJO to JSON using Jackson jars.
 * @author abdul
 */
public class PojoJson {

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
        String tenantId = "dummyTenant1";
        DummyConfig config = new DummyConfig();
        ClusterConfig clusterConfig = new ClusterConfig();
        clusterConfig.setClusterPort(9997);
        config.setClusterConfig(clusterConfig);
        config.setId(tenantId);
        config.setName(tenantId);
        config.setWebPort(7998);

        ObjectMapper mapper = new ObjectMapper(); 
        mapper.writeValue(new File(tenantId +".json"),config);
    }
}

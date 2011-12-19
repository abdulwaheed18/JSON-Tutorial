/**
 * 
 */
package waheed.demo.pojo.json.tutorial.using.gson;
import java.io.FileWriter;
import java.io.IOException;

import waheed.demo.pojo.json.tutorial.using.jetison.ClusterConfig;
import waheed.demo.pojo.json.tutorial.using.jetison.DummyConfig;


import com.google.gson.Gson;


/**
 * @author abdul
 *
 */
public class ToJson {
    
   public static void main(String[] args) {
        DummyConfig config = new DummyConfig();
        ClusterConfig clusterConfig = new ClusterConfig();
        clusterConfig.setClusterPort(9997);
        config.setClusterConfig(clusterConfig);
        config.setId("tenant1");
        config.setName("tenant1");
        config.setWebPort(7998);
              
        Gson gson = new Gson();
        
        String json = gson.toJson(config);
        try {
            //write converted json data to a file named "file.json"
            FileWriter writer = new FileWriter("demo.json");
            writer.write(json);
            writer.close();
     
        } catch (IOException e) {
            e.printStackTrace();
        }
     
        System.out.println(json);
        }
        
   }
   
    
    
    
    
 
    
   


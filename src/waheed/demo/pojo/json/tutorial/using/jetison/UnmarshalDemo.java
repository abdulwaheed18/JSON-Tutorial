package waheed.demo.pojo.json.tutorial.using.jetison;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamReader;
 
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamReader;

/**
 * Unmarhsall the JSON object to xml using jetison Jars
 * @author abdul
 *
 */
public class UnmarshalDemo {
 
    public static void main(String[] args) throws Exception {
        JAXBContext jc = JAXBContext.newInstance(DummyConfig.class);
 
        JSONObject obj = new JSONObject("{\"dummyConfig\":{\"placeholder\":\"placeholder\",\"clusterConfig\":{\"clusterPort\":9997},\"id\":\"tenant1\"," +
        		"\"name\":\"tenant1\",\"webPort\":7998,\"started\":false}}");
        Configuration config = new Configuration();
        MappedNamespaceConvention con = new MappedNamespaceConvention(config);
        XMLStreamReader xmlStreamReader = new MappedXMLStreamReader(obj, con);
 
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        DummyConfig config1 = (DummyConfig) unmarshaller.unmarshal(xmlStreamReader);
 
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(config1, System.out);
    }
 
}
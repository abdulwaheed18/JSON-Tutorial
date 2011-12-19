package waheed.demo.pojo.json.tutorial.using.jetison;


import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
 
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLStreamWriter;
 
import org.codehaus.jettison.mapped.Configuration;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;

/**
 * MArshalling the xml to JSon using Jetison Jars.
 * @author abdul
 *
 */
public class MarshalDemo  {
    public static void main(String[] args) throws Exception {
         
        
        JAXBContext jc = JAXBContext.newInstance(DummyConfig.class);
 
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        DummyConfig dummyConfig = (DummyConfig) unmarshaller.unmarshal(new File("demo.xml"));
 
        Configuration config = new Configuration();
        MappedNamespaceConvention con = new MappedNamespaceConvention(config);
        Writer writer = new OutputStreamWriter(System.out);
        XMLStreamWriter xmlStreamWriter = new MappedXMLStreamWriter(con, writer);
 
        Marshaller marshaller = jc.createMarshaller();
        marshaller.marshal(dummyConfig, xmlStreamWriter);
    }
}

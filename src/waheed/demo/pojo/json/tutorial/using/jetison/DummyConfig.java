package waheed.demo.pojo.json.tutorial.using.jetison;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class DummyConfig extends TenantConfig {
 String placeholder;

/**
 * @return the placeholder
 */
public String getPlaceholder() {
    return placeholder;
}

/**
 * @param placeholder the placeholder to set
 */
public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
}
 
}

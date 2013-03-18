package simple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EmbeddedObject {

	int one;
	int two;
	
	public EmbeddedObject() {}
	
	public EmbeddedObject(int one, int two) {
		
		this.one = one;
		this.two = two; 
	}
}

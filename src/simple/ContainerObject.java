package simple;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="json-response")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContainerObject {

	int number;
	
	@XmlElement(name="list-of-objects")
	List<EmbeddedObject> anotherObjectList = new ArrayList();
	
	public ContainerObject() {}
	
	public ContainerObject(int number, List<EmbeddedObject> anotherObjectList) {
		
		this.number = number; 
		this.anotherObjectList = anotherObjectList; 
	}
}

package biz.mathias.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="organization")
public class Organization {

	@Value("${org.myProp}")
	private String prop;
	
	public void say() {
		System.out.println("saying: "+prop);
	}
}

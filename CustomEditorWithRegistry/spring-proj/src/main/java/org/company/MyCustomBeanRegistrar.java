package org.company;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;

public class MyCustomBeanRegistrar implements PropertyEditorRegistrar{

	public void registerCustomEditors(PropertyEditorRegistry registry) {
        String secStr = "8*6:P(IYGJ";
        registry.registerCustomEditor(ServerConfig.class,
                                      new ServerConfigEditorx(secStr));
		
	}

}

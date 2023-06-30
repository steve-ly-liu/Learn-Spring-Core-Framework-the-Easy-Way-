package org.company.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apiimplementor.SecureStoreImpl;
import org.company.ManageAppData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.trustedcompany.SecureStoreAccess;

@Configuration
public class JavaConfig {
	
	@Bean
	public SecureStoreImpl secureStoreImpl() {
		int accountId = 11011;
		String username = "user1346";
		String password = "MyPasswrod28%";
		List<String> serverList = Arrays.asList("124.55.233.12","125.23.41.212");
		Map<String, String> configParams = new HashMap<String,String>();
		
		configParams.put("cores", "16");
		configParams.put("ram", "160GB");
		configParams.put("disk", "100TB");
		
		SecureStoreImpl obj = new SecureStoreImpl();
		obj.setAccountId(accountId);
		obj.setUsername(username);
		obj.setPassword(password);
		obj.setServerList(serverList);
		obj.setConfigParams(configParams);
		
		return obj;
	}
	
	@Bean
	public ManageAppData manageAppData(SecureStoreAccess secureStoreAccess) {
		return new ManageAppData(secureStoreAccess);
	}

}

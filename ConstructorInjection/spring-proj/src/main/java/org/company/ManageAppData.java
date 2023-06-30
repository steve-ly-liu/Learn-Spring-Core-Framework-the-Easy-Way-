package org.company;

import com.trustedcompany.SecureStoreAccess;

public class ManageAppData {

	SecureStoreAccess secureStore;
	
	public ManageAppData() {
		
	}
	
	public ManageAppData(SecureStoreAccess secureStore){
	this.secureStore = secureStore;	
	}
	
	public void storeData() {
		secureStore.connect();
		secureStore.putData();
	}
	
	public void getData() {
		secureStore.connect();
		secureStore.accessData();
	}
	
	public void disconnect() {
		secureStore.disconnect();
	}
}

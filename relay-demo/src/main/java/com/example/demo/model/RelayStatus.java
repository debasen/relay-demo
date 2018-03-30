package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RELAY_STATUS")
public class RelayStatus {

	@Id
	@Column(name = "DEVICE_ID")
	private String deviceId;
	private boolean relay1;
	private boolean relay2;
	private boolean relay3;
	private boolean relay4;

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public boolean isRelay1() {
		return relay1;
	}

	public void setRelay1(boolean relay1) {
		this.relay1 = relay1;
	}

	public boolean isRelay2() {
		return relay2;
	}

	public void setRelay2(boolean relay2) {
		this.relay2 = relay2;
	}

	public boolean isRelay3() {
		return relay3;
	}

	public void setRelay3(boolean relay3) {
		this.relay3 = relay3;
	}

	public boolean isRelay4() {
		return relay4;
	}

	public void setRelay4(boolean relay4) {
		this.relay4 = relay4;
	}

}

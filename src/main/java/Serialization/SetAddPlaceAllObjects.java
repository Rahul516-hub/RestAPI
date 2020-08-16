package Serialization;

import java.util.List;

public class SetAddPlaceAllObjects {

	
	private int accuracy;
	private String address;
	private String language;
	private SetAddPlaceLocation location;
	private String name;
	private String phone_number;
	private List<String> types;
	private String website;

	public int getAccuracy() {
		return accuracy;
	}

	public String getAddress() {
		return address;
	}

	public String getLanguage() {
		return language;
	}

	public SetAddPlaceLocation getLocation() {
		return location;
	}

	public String getName() {
		return name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public List<String> getTypes() {
		return types;
	}

	public String getWebsite() {
		return website;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setLocation(SetAddPlaceLocation location) {
		this.location = location;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public void setWebsite(String website) {
		this.website = website;
	}
}

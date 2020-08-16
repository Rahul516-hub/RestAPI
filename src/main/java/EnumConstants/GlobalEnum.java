package EnumConstants;

public enum GlobalEnum {
	
	AddPlaceAPI("/maps/api/place/add/json"),
	DeletePlaceAPI("/maps/api/place/delete/json"),
	GetPlaceAPI("/maps/api/place/get/json"),
	PutPlaceAPI("/maps/api/place/update/json");
	
	private String resource;

	GlobalEnum(String resource)
	{
		this.resource=resource;
	}

	
	public String GetResource()
	{
		return resource;
	}
}

package GlobalDeleteBody;

public class OverallDelete {
	
	private DeleteBody dbs;
	
	public DeleteBody OD(String place_id)
	{
	 dbs = new DeleteBody();
	dbs.setPlace_id(place_id);
	
	return dbs;
	
   
	
	}
}

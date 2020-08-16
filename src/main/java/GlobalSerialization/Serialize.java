package GlobalSerialization;

import java.util.ArrayList;
import java.util.List;

import Serialization.SetAddPlaceAllObjects;
import Serialization.SetAddPlaceLocation;

public class Serialize {

	public SetAddPlaceAllObjects Serialization(int accuracy, String name, String language, String address,
			String website, String phone_number) {

		SetAddPlaceAllObjects sapao = new SetAddPlaceAllObjects();

		sapao.setAccuracy(accuracy);
		sapao.setAddress(address);
		sapao.setLanguage(language);

		SetAddPlaceLocation sapal = new SetAddPlaceLocation();
		sapal.setLat(-656.255);
		sapal.setLng(-663.55);

		sapao.setLocation(sapal);
		sapao.setName(name);
		sapao.setPhone_number(phone_number);
		sapao.setWebsite(website);

		List<String> all = new ArrayList<String>();

		all.add("Mochi");
		all.add("Chochi");

		sapao.setTypes(all);

		return sapao;
	}

}

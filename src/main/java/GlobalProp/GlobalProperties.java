package GlobalProp;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalProperties {

	private FileInputStream fis;
	private Properties prop;

	public Properties GlobProp() throws IOException {
		fis = new FileInputStream("C:\\Users\\(-_-)RhYtHm(o_0)\\workspace1\\APIFramework\\API.properties");
		prop = new Properties();
		prop.load(fis);

		return prop;
	}

}

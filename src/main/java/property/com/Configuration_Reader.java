package property.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws IOException {
	File f = new File("C:\\Users\\HP\\eclipse-workspace\\Mavenpro\\src\\main\\java\\property\\com\\Adactin.properties");
    FileInputStream fis = new  FileInputStream(f);
    p = new Properties();
    p.load(fis);
}
	public String getUrl() throws IOException {
		String url = p.getProperty("url");
		return url;

	}
	public String getusername() {
		String username = p.getProperty("username");
		return username;

	}

	
	public String password() throws IOException {
		String password = p.getProperty("password");
		return password;

	}
	public String location() throws IOException {
		String location = p.getProperty("location");
		return location;

	}
	
	public String Hotels() throws IOException {
		String Hotels = p.getProperty("Hotels");
		return Hotels;

	}
	public String Rt() throws IOException {
		String Rt = p.getProperty("Rt");
		return Rt;
	}
	public String Rn() throws IOException {
		String Rn = p.getProperty("Rn");
		return Rn;
	}
	public String Datein() throws IOException {
		String Datein = p.getProperty("Datein");
		return Datein;
	}
	public String Dateout() throws IOException {
		String Dateout = p.getProperty("Dateout");
		return Dateout;
	}
	public String Adr () throws IOException {
		String Adr  = p.getProperty("Adr");
		return Adr ;
	}
	public String Cdr () throws IOException {
		String Cdr  = p.getProperty("Cdr");
		return Cdr ;
	}
	public String Fn () throws IOException {
		String Fn  = p.getProperty("Fn");
		return Fn ;
	}
	public String Ln () throws IOException {
		String Ln  = p.getProperty("Ln");
		return Ln ;
	}
	public String Ad () throws IOException {
		String Ad  = p.getProperty("Ad");
		return Ad ;
	}
	public String Cn () throws IOException {
		String Cn  = p.getProperty("Cn");
		return Cn ;
	}
	public String Ct () throws IOException {
		String Ct  = p.getProperty("Ct");
		return Ct ;
	}
	public String Cexp  () throws IOException {
		String Cexp   = p.getProperty("Cexp");
		return Cexp  ;
	}
	public String Cexpyear () throws IOException {
		String Cexpyear  = p.getProperty("Cexpyear");
		return Cexpyear ;
	}
	public String Cv () throws IOException {
		String Cv  = p.getProperty("Cv");
		return Cv ;
	}
	
	
}

package core;

public class DatabaseLogger implements BaseLogger{

	@Override
	public void log(String message) {
		System.out.println("Veritabanýna Loglama iþlemi baþarýlý, Log: " + message);
		
	}

}

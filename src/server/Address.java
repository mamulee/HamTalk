package server;

public class Address {



	private static String dbAddress = "localhost";
	private static int dbPort = 1521;
	private static String serverAddress = "localhost";
	private static int serverPort = 5001;
	public static String getDbAddress() {
		return dbAddress;
	}
	public static int getDbPort() {
		return dbPort;
	}
	public static String getServerAddress() {
		return serverAddress;
	}
	public static int getServerPort() {
		return serverPort;
	}
	
}

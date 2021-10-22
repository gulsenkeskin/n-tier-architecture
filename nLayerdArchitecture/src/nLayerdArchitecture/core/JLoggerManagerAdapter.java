package nLayerdArchitecture.core;

import nLayerdArchitecture.jLogger.JloggerManager;

public class JLoggerManagerAdapter implements LoggerService {
	@Override
	public void logToSystem(String message) {
		//burda injectionda yapýlabilir ancak new'lemek de sakýncalý deðil
		JloggerManager manager = new JloggerManager();
		manager.log(message);// loggerServicede kendi oluþturduðumuz þablona dýþ servisi çaðýrdýk		
	//burada dýþ servisin jlogger'ýný kullanmýþ olduk (simülasyon)
	}
}

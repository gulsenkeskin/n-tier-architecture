package nLayerdArchitecture.core;

import nLayerdArchitecture.jLogger.JloggerManager;

public class JLoggerManagerAdapter implements LoggerService {
	@Override
	public void logToSystem(String message) {
		//burda injectionda yap�labilir ancak new'lemek de sak�ncal� de�il
		JloggerManager manager = new JloggerManager();
		manager.log(message);// loggerServicede kendi olu�turdu�umuz �ablona d�� servisi �a��rd�k		
	//burada d�� servisin jlogger'�n� kullanm�� olduk (sim�lasyon)
	}
}

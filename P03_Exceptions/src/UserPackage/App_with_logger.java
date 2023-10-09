package UserPackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App_with_logger {

	/*
	 * Pour utiliser un logger lo4j :
	 * 
	 * * RETIRER LE FICHIER module-info.java du dossier src
	 * 
	 * - Télécharger log4j sur le site d'Apache :
	 * https://www.apache.org/dyn/closer.lua/logging/log4j/2.20.0/apache-log4j-2.20.0-bin.zip
	 * 
	 * - Extraire le zip
	 * - Créer un répertoire lib dans le projet (facultatif, mais plus pratique d'avoir les .jar dans le projet)
	 * - Y ajouter :
	 * 		- log4j-api-2.20.0.jar
	 * 		- log4j-core-2.20.0.jar
	 * 
	 * - Rajouter les 2 libraries au "Build path" : clic droit sur le projet => Build Path => Configure Build Path => Libraries => ClassPath => Add jars
	 * 
	 * Pour ajouter un fichier de configuration log4j :
	 * 
	 * - Créer un dossier "resources" (ou autre nom...)
	 * - Y créer un fichier nommé log4j2.xml
	 * - Dans ce fichier copier/coller :*/
	
	  
//	  <?xml version="1.0" encoding="UTF-8"?>
//	  <Configuration status="WARN">
//	  		<Appenders>
//	  				<Console name="Console" target="SYSTEM_OUT">
//	  					<PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
//	  				</Console>
//	  		</Appenders>
//	  		<Loggers> 
//	 				<Root level="trace">
//	 					<AppenderRef ref="Console"/>
//	  				</Root>
//	  		</Loggers>
//	  </Configuration>
	  
	 /* - Ajouter le dossier "resources" au build path : clic droit sur projet =>
	 * 								build path => configure build path => Source => Add folder
	 * 
	 * Doc log4j :
	 * - site : https://logging.apache.org/log4j/2.x/manual/index.html
	 * - pdf : https://logging.apache.org/log4j/2.x/log4j-users-guide.pdf
	 *
	 * https://www.youtube.com/watch?v=MzhRbQQJo3M&list=PLL34mf651faNrQbmeK2XigJ68fLAj9buv
	 * 
	 * OFF 0
	 * FATAL 100
	 * ERROR 200
	 * WARN 300
	 * INFO 400
	 * DEBUG 500
	 * TRACE 600
	 * ALL Integer.MAX_VALUE
	 */
	
	private static Logger logger = LogManager.getLogger(App_with_logger.class);

	public static void main(String[] args) {

		logger.info("Début du programme");

		try {

			User user = new User("Duck", "Riri", 12);

			logger.debug(user.toString());

			user.setAge(42);

			logger.debug(user.toString());

			user.setAge(-1);
			
		} catch (IllegalAgeException e) {

			logger.error(e.getMessage());

		} catch (IllegalArgumentException e) {

			logger.error(e.getMessage());
		}
	}
}

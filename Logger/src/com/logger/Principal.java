package com.logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.Handler;

public class Principal {
	// Atribui ao nome do logger, o mesmo nome da classe
	static Logger logger = Logger.getLogger(Principal.class.getName());

	public static void main(String[] args) {
		try {
			// Carrega as configurações para o logger, do arquivo "mylogging.properties"
			LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}
		;
		// Define o nível de severidade do log
		logger.setLevel(Level.FINE);
		logger.addHandler(new ConsoleHandler());
		logger.addHandler(new MyHandler());
		Handler fileHandler;
		try {
			// Define o nome do arquivo de local do log
			fileHandler = new FileHandler("MyLog.log", true);// nome_do_log, adiciona msg novas ao arquivo existente
			// Define a formatação do log, nesse caso a classe MyFormatter
			fileHandler.setFormatter(new MyFormatter());
			// Define um Filtro, OPCIONAL
			fileHandler.setFilter(new MyFilter());
			logger.addHandler(fileHandler);
		} catch (SecurityException | IOException e) {
			e.printStackTrace();
		}

		// Loga um evento no arquivo
		for (int i = 0; i < 50; i++) {
			logger.log(Level.CONFIG, "Teste logger " + i);
			logger.log(Level.INFO, "Teste logger " + i);
			logger.log(Level.SEVERE, "Teste logger " + i);
		}

	}

}

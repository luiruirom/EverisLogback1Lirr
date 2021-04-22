package com.everis.logback_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger("loggerFibo");
		/**
		 *  Sucesión de Fibonacci partiendo de los dos primeros números 
		 */
		int fib1 = 1;
		int fib2 = 1;

		logger.debug("Valor inicial fib1: {}", fib1);
		logger.debug("Valor inicial fib2: {}", fib2);

		logger.info("Entra en la sucesión de Fibonacci");
		logger.info("Las dos primeras iteraciones son los valores de fib1 y fib2");
		for (int i = 3; i < 51; i++) {
			fib2 = fib1 + fib2;
			fib1 = fib2 - fib1;

			logger.debug("Iteracion " + i + " de la sucesion: " + fib2);
		}
	}
}

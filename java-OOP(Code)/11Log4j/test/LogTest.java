package cn.bdqn.test;

import org.apache.log4j.Logger;

public class LogTest {

	/**
	 * �����Ա����
	 */
	static Logger log = Logger.getLogger(LogTest.class);

	public static void main(String[] args) {
		log.fatal("fatal   msg");
		log.error("error   msg");
		log.warn("warn   msg");
		log.info("info   msg");
		log.debug("debug   msg");
		log.trace("trace   msg");

	}

}

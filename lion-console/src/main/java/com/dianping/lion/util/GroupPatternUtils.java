package com.dianping.lion.util;

import com.dianping.lion.entity.Config;
import com.dianping.lion.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class GroupPatternUtils {

	private static final String JDBC_GROUP = "jdbc";

	private static final String JDBC_URL = "jdbc.url";

	private static final String JDBC_USERNAME = "jdbc.username";

	private static final String JDBC_PASSWORD = "jdbc.password";

	private static final String JDBC_DRIVERCLASS = "jdbc.driverClass";

	private static final String JDBC_URL_PATTERN = ".+\\.jdbc\\.url";

	private static final String JDBC_PASSWORD_PATTERN = ".+\\.jdbc\\.password";

	private static final String JDBC_USERNAME_PATTERN = ".+\\.jdbc\\.username";

	private static final String JDBC_DRIVERCLASS_PATTERN = ".+\\.jdbc\\.driverClass";

	public enum JDBCGroup {
		JDBC_NO, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD, JDBC_DRIVERCASS
	}

	public static String getJDBCKeyPattern(String key) {
		switch (typeofJDBC(key)) {
		case JDBC_URL:
			return key.replace(JDBC_URL, JDBC_GROUP);
		case JDBC_USERNAME:
			return key.replace(JDBC_USERNAME, JDBC_GROUP);
		case JDBC_PASSWORD:
			return key.replace(JDBC_PASSWORD, JDBC_GROUP);
		case JDBC_DRIVERCASS:
			return key.replace(JDBC_DRIVERCLASS, JDBC_GROUP);
		default:
			return null;
		}
	}

	public static JDBCGroup typeofJDBC(String key) {
		if (Pattern.compile(JDBC_URL_PATTERN).matcher(key).matches()) {
			return JDBCGroup.JDBC_URL;
		}
		if (Pattern.compile(JDBC_USERNAME_PATTERN).matcher(key).matches()) {
			return JDBCGroup.JDBC_USERNAME;
		}
		if (key.matches(JDBC_PASSWORD_PATTERN)) {
			return JDBCGroup.JDBC_PASSWORD;
		}
		if (key.matches(JDBC_DRIVERCLASS_PATTERN)) {
			return JDBCGroup.JDBC_DRIVERCASS;
		}
		return JDBCGroup.JDBC_NO;
	}
}

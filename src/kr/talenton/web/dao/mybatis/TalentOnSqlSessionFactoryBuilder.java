package kr.talenton.web.dao.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TalentOnSqlSessionFactoryBuilder {
	static SqlSessionFactory ssf;
	
	static{
		String resource = "kr/talenton/web/dao/mybatis/MyBatisConfig.xml";
		InputStream inputStream = null;
		
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ssf = new SqlSessionFactoryBuilder().build(inputStream);
		
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {

		return ssf;
	}
}

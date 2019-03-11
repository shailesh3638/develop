package org.project.messenger.Services.ReadDataServices;

import javax.sql.DataSource;
import javax.ws.rs.Path;

import org.project.messenger.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.object.StoredProcedure;
import org.springframework.stereotype.Component;
@Component
@Path("/getuser")
public class ReadDataServicesImpl extends StoredProcedure implements ReadDataServices  {
@Autowired
	private DataSource dataSource;


public DataSource getDataSource() {
	return dataSource;
}

public void setDataSource(DataSource dataSource) {
	this.dataSource = dataSource;
}

JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);

@Override
	public String getUser() {
		User user = new User();
		user.setId(1);
		user.setName("Shailesh");
		user.setUserName("shailesh123");
		int a=jdbcTemplate.update("INSERT INTO USER1234 VALUES  (0123, 'shailesh', 'shailesh')");
		if(a!=0){
			return "success";
			
		}
		return "failure";
	}
}

package service;

import domain.UserVO;
import persistence.UserDAO;
import static persistence.JDBCUtil.*;

import java.sql.Connection;

public class UserAddService {
	public boolean addUser(UserVO vo) throws Exception {
		boolean isInsertSuccess = false;
		// DAO 작업
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		if(dao.insertUser(vo)) {
			commit(con);
			isInsertSuccess = true;
		}else {
			rollback(con);
		}
		
		close(con);
		
		return isInsertSuccess;
	}
}

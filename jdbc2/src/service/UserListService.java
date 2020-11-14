package service;

import java.sql.Connection;
import java.util.List;

import domain.UserVO;
import persistence.UserDAO;
import static persistence.JDBCUtil.*;

public class UserListService {
	// dao.getList() 결과를 받아서 UserListAction에게 넘기기
	public List<UserVO> getUserList() {
		
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		List<UserVO> list = dao.getList();
		close(con);
		return list;
		
	}
}

package service;

import domain.UserVO;
import persistence.UserDAO;

import static persistence.JDBCUtil.*;

import java.sql.Connection;

public class UserRowService {
	public UserVO getUserRow(int no) {
		//UserDAO의 getRow() 호출하여 결과 전송받기
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		UserVO vo = dao.getRow(no);
		
		close(con);
		
		// 전송받은 결과를 UserRowAction 넘겨주기
		return vo;
	}
}

package service;

import domain.UserVO;
import persistence.UserDAO;

import static persistence.JDBCUtil.*;

import java.sql.Connection;

public class UserUpdateService {
	public boolean userUpdate(UserVO updateUser) {
		boolean isUpdateSuccess = false;
		
		//회원정보 수정 데이터를 DAO에 넘겨주고 결과 리턴 받기
		Connection con = getConnection();
		UserDAO dao = new UserDAO(con);
		
		if(dao.updateUser(updateUser.getAddr(), updateUser.getNo())) {
			commit(con);
			isUpdateSuccess = true;
		} else {
			rollback(con);
		}
		
		close(con);
		return isUpdateSuccess;
	}
}

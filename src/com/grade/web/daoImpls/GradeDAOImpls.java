package com.grade.web.daoImpls;
import com.grade.web.domains.GradeBean;
import com.grade.web.pool.Constants;
import java.io.File;

import com.grade.web.DAO.GradeDAO;

public class GradeDAOImpls implements GradeDAO {

	
	public void insertGrade(GradeBean param) {
		try {
			File file = new File(Constants.FILE_PATH + "grade.txt");
			}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}


}

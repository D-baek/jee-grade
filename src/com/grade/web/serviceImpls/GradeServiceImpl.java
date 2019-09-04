package com.grade.web.serviceImpls;
import java.util.Random;
import com.grade.web.DAO.GradeDAO;
import com.grade.web.daoImpls.GradeDAOImpls;
import com.grade.web.domains.GradeBean;
import com.grade.web.service.GradeService;


public class GradeServiceImpl implements GradeService {
	private GradeDAOImpls dao;
	
	public GradeServiceImpl() {
		dao = new GradeDAOImpls();
	}

	@Override
	public void createGrade(GradeBean param) {
		param.setHakbun(createHakbun(param));
		param.setName(param.getName());
		param.setKor(param.getKor());
		param.setEng(param.getEng());
		param.setMath(param.getMath());
		param.setSociety(param.getSociety());
		param.setSsn(param.getSsn());
		dao.insertGrade(param);
	}


	@Override
	public String createHakbun(GradeBean param) {
		Random r = new Random();
		String year = "2019-";
		String sex = param.getSsn().substring(7,8);
		String result = "";
		for(int i = 0; i<3; i++) {
			result += r.nextInt(9)+"";
		}
		return year+sex+result;
	}
}

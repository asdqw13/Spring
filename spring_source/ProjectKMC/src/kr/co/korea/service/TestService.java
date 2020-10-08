package kr.co.korea.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.korea.beans.TestBean;
import kr.co.korea.dao.TestDao;

@Service
public class TestService {
	
	@Autowired
	private TestDao testDao;
	
	public void insertMemberInfo(TestBean testBean) {
		testDao.insertMemberInfo(testBean);
	}

	public void deleteMemberInfo(TestBean testBean) {
		testDao.deleteMemberInfo(testBean);
	}
}
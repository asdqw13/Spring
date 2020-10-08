package kr.co.korea.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.korea.beans.TestBean;
import kr.co.korea.mapper.TestMapper;

@Repository
public class TestDao {

	@Autowired
	private TestMapper testMapper;
	
	public void insertMemberInfo(TestBean testBean) {
		testMapper.insertMemberInfo(testBean);
	}
	
	public void deleteMemberInfo(TestBean testBean) {
		testMapper.deleteMemberInfo(testBean);
	}
}
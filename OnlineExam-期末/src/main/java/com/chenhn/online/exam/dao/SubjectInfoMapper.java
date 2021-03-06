package com.chenhn.online.exam.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.chenhn.online.exam.po.SubjectInfo;

/**
  *
  * <p>Title: SubjectInfoMapper</p>
  * <p>Description: </p>
  * @author: chen
  * @date: 2019-5-17sss
  * @time: 下午4:30:09
  * @version: 1.0
  */

@Repository
public interface SubjectInfoMapper {

	public List<SubjectInfo> getSubjects(Map<String, Object> map);
	
	public SubjectInfo getSubjectWithId(int subjectId);
	
	public int getSubjectTotal();
	
	public int isAddSubject(SubjectInfo subject);
	
	public int isUpdateSubject(SubjectInfo subject);

	public int isDelSubject(int subjectId);
	
	//批量添加试题
	public int isAddSubjects(Map<String, Object> map);
}

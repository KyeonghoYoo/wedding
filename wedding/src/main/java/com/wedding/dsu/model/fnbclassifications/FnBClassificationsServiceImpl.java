package com.wedding.dsu.model.fnbclassifications;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.FnBClassificationsMapper;

/**
 * 식음료분류 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.06 v0.1
 */
@Service
public class FnBClassificationsServiceImpl implements FnBClassificationsService {
	@Autowired
	FnBClassificationsMapper FnBClassificationsMapper;

	/**
	 * 식음료분류 삽입
	 * 
	 * @param FnBClassificationsVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertFnBClassification(FnBClassificationsVO FnBClassificationsVO) throws Exception {
		return FnBClassificationsMapper.insertFnBClassification(FnBClassificationsVO);
	}

	/**
	 * 식음료분류 리스트 조회
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<FnBClassificationsVO> selectFnBClassifications(FnBClassificationsVO fnBClassificationsVO)
			throws Exception {
		return FnBClassificationsMapper.selectFnBClassifications(fnBClassificationsVO);
	}

	/**
	 * 식음료분류 상세 조회
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public FnBClassificationsVO selectFnBClassification(FnBClassificationsVO fnBClassificationsVO)
			throws Exception {
		return FnBClassificationsMapper.selectFnBClassification(fnBClassificationsVO);
	}

	/**
	 * 식음료분류 수정
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateFnBClassification(FnBClassificationsVO fnBClassificationsVO) throws Exception {
		return FnBClassificationsMapper.updateFnBClassification(fnBClassificationsVO);
	}

	/**
	 * 식음료분류 삭제
	 * 
	 * @param FnBClassificationsVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteFnBClassification(FnBClassificationsVO fnBClassificationsVO) throws Exception {
		return FnBClassificationsMapper.deleteFnBClassification(fnBClassificationsVO);
	}

}

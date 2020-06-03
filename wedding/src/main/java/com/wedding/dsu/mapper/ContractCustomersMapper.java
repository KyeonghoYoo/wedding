package com.wedding.dsu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wedding.dsu.model.contractcustomers.ContractCustomersSearchVO;
import com.wedding.dsu.model.contractcustomers.ContractCustomersVO;

/**
 * 계약고객 Mapper
 * @author 유경호
 * @version 2019.08.01 v0.1
 * */
public interface ContractCustomersMapper {
	/**
	 * 계약고객 등록
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public int insertContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception;
	
	/**
	 * 계약고객 리스트 조회
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public List<ContractCustomersVO> selectContractCustomers(ContractCustomersSearchVO contractCustomersSearchVO) throws Exception;

	/**
	 * 계약고객 조회
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public ContractCustomersVO selectContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception;

	/**
	 * 계약고객 수정
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public int updateContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception;
	/**
	 * 계약고객 삭제
	 * @param 
	 * @return 
	 * @throws Exception
	 */
	public int deleteContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception;
}

package com.wedding.dsu.model.contractcustomers;

import java.util.List;

/**
 * 계약고객 Service Interface
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
public interface ContractCustomersService {
/**
	 * 계약고객 등록
	 * @param ContractCustomersVO contractCustomersVO
	 * @return 
	 * @throws Exception
	 */
	public int insertContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception;
	
	/**
	 * 계약고객 리스트 조회
	 * @param ContractCustomersVO contractCustomersVO
	 * @return 
	 * @throws Exception
	 */
	public List<ContractCustomersVO> selectContractCustomers(ContractCustomersSearchVO contractCustomersSearchVO) throws Exception;

	/**
	 * 계약고객 조회
	 * @param ContractCustomersVO contractCustomersVO
	 * @return 
	 * @throws Exception
	 */
	public ContractCustomersVO selectContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception;

	/**
	 * 계약고객 수정
	 * @param ContractCustomersVO contractCustomersVO
	 * @return 
	 * @throws Exception
	 */
	public int updateContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception;
	/**
	 * 계약고객 삭제
	 * @param ContractCustomersVO contractCustomersVO
	 * @return 
	 * @throws Exception
	 */
	public int deleteContractCustomer(ContractCustomersVO contractCustomersVO) throws Exception;
}

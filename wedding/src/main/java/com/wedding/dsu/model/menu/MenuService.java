package com.wedding.dsu.model.menu;

import java.util.List;

/**
 * 메뉴 Service Interface
 * @author 유경호
 * @version 2019.08.05 v0.1
 * */
public interface MenuService {
	/**
	 * 메뉴 삽입
	 * @param MenuVO
	 * @return 
	 * @throws Exception
	 */ 
	public int insertMenu(MenuVO menuVO) throws Exception;
	
	/**
	 * 메뉴 리스트 조회
	 * 
	 * @param MenuVO
	 * @return
	 * @throws Exception
	 */
	public List<MenuVO> selectMenus(MenuVO menuVO) throws Exception;

	/**
	 * 메뉴 상세 조회
	 * 
	 * @param MenuVO
	 * @return
	 * @throws Exception
	 */
	public MenuVO selectMenu(MenuVO menuVO) throws Exception;

	/**
	 * 메뉴 수정
	 * 
	 * @param MenuVO
	 * @return
	 * @throws Exception
	 */
	public int updateMenu(MenuVO menuVO) throws Exception;

	/**
	 * 메뉴 삭제
	 * 
	 * @param MenusVO
	 * @return
	 * @throws Exception
	 */
	public int deleteMenu(MenuVO menuVO) throws Exception;
}

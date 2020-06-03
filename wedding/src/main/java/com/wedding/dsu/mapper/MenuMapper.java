package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.menu.MenuVO;

/**
 * 메뉴 Mapper
 * 
 * @author 유경호
 * @version 2019.08.05 v0.1
 */
public interface MenuMapper {
	/**
	 * 메뉴 등록
	 * 
	 * @param menuVO
	 * @return
	 * @throws Exception
	 */
	public int insertMenu(MenuVO menuVO) throws Exception;

	/**
	 * 메뉴 리스트 조회
	 * 
	 * @param menuVO
	 * @return
	 * @throws Exception
	 */
	public List<MenuVO> selectMenus(MenuVO menuVO) throws Exception;

	/**
	 * 메뉴 상세 조회
	 * 
	 * @param menuVO
	 * @return
	 * @throws Exception
	 */
	public MenuVO selectMenu(MenuVO menuVO) throws Exception;

	/**
	 * 메뉴 수정
	 * 
	 * @param menuVO
	 * @return
	 * @throws Exception
	 */
	public int updateMenu(MenuVO menuVO) throws Exception;

	/**
	 * 메뉴 삭제
	 * 
	 * @param menuVO
	 * @return
	 * @throws Exception
	 */
	public int deleteMenu(MenuVO menuVO) throws Exception;
}

package com.wedding.dsu.model.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.MenuMapper;

/**
 * 메뉴 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.05 v0.1
 */
@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
	MenuMapper menuMapper;

	/**
	 * 메뉴 삽입
	 * 
	 * @param MenuVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertMenu(MenuVO MenuVO) throws Exception {
		return menuMapper.insertMenu(MenuVO);
	}

	/**
	 * 메뉴 리스트 조회
	 * 
	 * @param MenuVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<MenuVO> selectMenus(MenuVO MenuVO) throws Exception {
		return menuMapper.selectMenus(MenuVO);
	}

	/**
	 * 메뉴 상세 조회
	 * 
	 * @param MenuVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public MenuVO selectMenu(MenuVO MenuVO) throws Exception {
		return menuMapper.selectMenu(MenuVO);
	}

	/**
	 * 메뉴 수정
	 * 
	 * @param MenuVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateMenu(MenuVO MenuVO) throws Exception {
		return menuMapper.updateMenu(MenuVO);
	}

	/**
	 * 메뉴 삭제
	 * 
	 * @param MenuVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteMenu(MenuVO MenuVO) throws Exception {
		return menuMapper.deleteMenu(MenuVO);
	}

}

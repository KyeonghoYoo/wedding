package com.wedding.dsu.mapper;

import java.util.List;

import com.wedding.dsu.model.eventschedulelist.EventScheduleListVO;

/**
 * 행사내역 Mapper
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1.2
 */
public interface EventScheduleListMapper {
	/**
	 * 행사내역 내역 등록
	 * 
	 * @param EventScheduleListVO
	 * @return
	 * @throws Exception
	 */
	public int insertEventScheduleList(EventScheduleListVO eventScheduleListVO) throws Exception;

	/**
	 * 행사내역 내역 리스트 조회
	 * 
	 * @param EventScheduleListVO
	 * @return
	 * @throws Exception
	 */
	public List<EventScheduleListVO> selectEventScheduleList(EventScheduleListVO eventScheduleListVO) throws Exception;

	/**
	 * 행사내역 내역 수정
	 * 
	 * @param EventScheduleListVO
	 * @return
	 * @throws Exception
	 */
	public int updateEventScheduleList(EventScheduleListVO eventScheduleListVO) throws Exception;

	/**
	 * 행사내역 내역 삭제
	 * 
	 * @param EventScheduleListVO
	 * @return
	 * @throws Exception
	 */
	public int deleteEventScheduleList(EventScheduleListVO eventScheduleListVO) throws Exception;
}

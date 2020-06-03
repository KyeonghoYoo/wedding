package com.wedding.dsu.model.eventschedulelist;

import java.util.List;

/**
 * 행사내역 Service Interface
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
public interface EventScheduleListService {
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

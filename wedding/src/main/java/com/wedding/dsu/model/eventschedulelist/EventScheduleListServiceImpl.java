package com.wedding.dsu.model.eventschedulelist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wedding.dsu.mapper.EventScheduleListMapper;

/**
 * 행사 내역 ServiceImpl
 * 
 * @author 유경호
 * @version 2019.08.08 v0.1
 */
@Service
public class EventScheduleListServiceImpl implements EventScheduleListService {
	@Autowired
	EventScheduleListMapper eventScheduleListMapper;

	/**
	 * 행사 내역 삽입
	 * 
	 * @param eventScheduleListVO
	 * @return 삽입된 row 수
	 * @throws Exception
	 */
	@Override
	public int insertEventScheduleList(EventScheduleListVO eventScheduleListVO) throws Exception {
		return eventScheduleListMapper.insertEventScheduleList(eventScheduleListVO);
	}

	/**
	 * 행사 내역 리스트 조회
	 * 
	 * @param eventScheduleListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<EventScheduleListVO> selectEventScheduleList(EventScheduleListVO eventScheduleListVO)
			throws Exception {
		return eventScheduleListMapper.selectEventScheduleList(eventScheduleListVO);
	}

	/**
	 * 행사 내역 수정
	 * 
	 * @param eventScheduleListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int updateEventScheduleList(EventScheduleListVO eventScheduleListVO) throws Exception {
		return eventScheduleListMapper.updateEventScheduleList(eventScheduleListVO);
	}

	/**
	 * 행사 내역 삭제
	 * 
	 * @param eventScheduleListVO
	 * @return
	 * @throws Exception
	 */
	@Override
	public int deleteEventScheduleList(EventScheduleListVO eventScheduleListVO) throws Exception {
		return eventScheduleListMapper.deleteEventScheduleList(eventScheduleListVO);
	}

}

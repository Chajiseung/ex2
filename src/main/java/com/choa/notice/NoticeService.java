package com.choa.notice;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.choa.util.MakePage;
import com.choa.util.PageMaker;
import com.choa.util.Rowmaker;

@Service
//NoticeService noticeService = new NoticeService();
public class NoticeService {
	
	@Inject
	private NoticeDAO noticeDAO;
	
	/*public NoticeService(NoticeDAO noticeDAO){
		this.noticeDAO = noticeDAO;
	}*/
	
	public NoticeDTO noticeView(int num) throws Exception{
		
		
		return noticeDAO.noticeView(num);
	}
	
	public List<NoticeDTO> noticeList(Integer curPage) throws Exception{
		
		int result = noticeDAO.noticeCount();
		PageMaker pageMaker = new PageMaker(curPage);
		
		String kind = null;
		String search = null;
		
		
		return noticeDAO.noticeList(pageMaker.getRowmaker(kind, search));
	}

	public int noticeWrite(NoticeDTO noticeDTO) throws Exception{
		
		return noticeDAO.noticeWrite(noticeDTO);
	}
	
	public int noticeUpdate(NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.noticeUpdate(noticeDTO);
	}
	
	public int noticeDelete(int num) throws Exception{
		return noticeDAO.noticeDelete(num);
	}

}

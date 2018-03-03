package kr.co.dhflour.guestbook.dao.test;

import java.util.List;

import kr.co.dhflour.guestbook.dao.GuestbookDao;
import kr.co.dhflour.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {		
		
		//insertTest();
		deleteTest();
		fetchListTest();		
		
	}
	
	public static void fetchListTest() {
		GuestbookDao dao = new GuestbookDao();
		
		List<GuestbookVo> list = dao.fetchlist();
		for(GuestbookVo vo:list) {
			System.out.println(vo);
		}
			
	}
	
	public static void insertTest() {
		GuestbookDao dao = new GuestbookDao();
		
		GuestbookVo vo = new GuestbookVo();
		vo.setName("도넛");
		vo.setPassword("1234");
		vo.setContents("테스트입니다.");
		
		dao.insert(vo);
			
	}
	
	public static void deleteTest() {
		GuestbookDao dao = new GuestbookDao();
		
		GuestbookVo vo = new GuestbookVo();
		vo.setNo(5);
		vo.setPassword("1234");
		
		dao.delete(vo);
			
	}
}

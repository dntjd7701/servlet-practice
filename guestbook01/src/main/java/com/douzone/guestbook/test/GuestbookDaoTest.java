package com.douzone.guestbook.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {

	public static void main(String[] args) {
//		insertTest();
		findAllTest();
//		deleteTest(1, "1234");
	}

	private static void insertTest() {
		GuestbookVo vo = null;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		Date time = new Date();
		String now = time.toString();
		
		

		vo = new GuestbookVo();
		vo.setName("우성");
		vo.setPassword("1234");
		vo.setMessage("Hellow~~");
//		vo.setRegDate(now);
		new GuestbookDao().insert(vo);

	}

	private static void findAllTest() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		for (GuestbookVo vo : list) {
			System.out.println(vo);
		}

	}

	private static void deleteTest(Long no, String password) {
		new GuestbookDao().delete(no, password);
	}

}

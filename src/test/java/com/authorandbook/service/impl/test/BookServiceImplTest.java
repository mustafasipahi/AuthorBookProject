package com.authorandbook.service.impl.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.authorandbook.model.Book;
import com.authorandbook.service.BookService;

@SpringBootTest
public class BookServiceImplTest {

	@Autowired
	private BookService bookService;
		
	@Test
	public void saveTest() {
//		Book testBook = new Book();
//		testBook.setId(5);
//		testBook.setBookName("Test Name");
//		testBook.setBookAuthor("Test Author");
//		
//		bookService.save(testBook);		
//		Book testbook2 = bookService.findByBookId(5);
//		
//		assertEquals(testbook2.getId(), testBook.getId());
//		assertTrue(testbook2.getId() > 0);		
	}
}

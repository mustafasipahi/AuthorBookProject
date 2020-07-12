package com.authorandbook.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.authorandbook.model.Book;

@Service
public interface BookService {

	public void saveBook(Book book);
	public void updateBook(Book book,int id);
	public void deleteBook(int id);
	public Book findByBookId(int id);
	public List<Book> getAll();
}

package com.authorandbook.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.authorandbook.model.Author;

@Service
public interface AuthorService {

	public void saveAuthor(Author author);
	public void updateAuthor(Author author, int id);
	public void deleteAuthor(int id);
	public Author findByAuthorId(int id);
	public List<Author> getAll();
}

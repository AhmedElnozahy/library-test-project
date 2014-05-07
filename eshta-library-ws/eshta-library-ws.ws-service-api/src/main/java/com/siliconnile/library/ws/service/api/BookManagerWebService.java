package com.siliconnile.library.ws.service.api;

import java.util.Collection;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.siliconnile.library.domain.Book;


@Path("/")
public interface BookManagerWebService {
	
	@GET
    @Path("library/BooksInfo")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Book> getBooksInfo() throws Exception;
	
	@POST
    @Path("library/BookInfo")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBookInfo(@FormParam ("bookId") int id) throws Exception;
	
}

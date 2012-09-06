package examples.tutorial.bookstore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;
import javax.jcr.RepositoryException;

import org.exoplatform.container.ExoContainer;
import org.exoplatform.container.ExoContainerContext;
import org.exoplatform.container.PortalContainer;
import org.exoplatform.container.RootContainer;
import org.exoplatform.services.jcr.RepositoryService;
import org.exoplatform.services.jcr.config.RepositoryConfigurationException;
import org.exoplatform.test.BookStoreService;
import org.exoplatform.test.BookStoreServiceImpl;
import org.exoplatform.test.SimpleService;
import org.exoplatform.test.entity.Book;
//import org.exoplatform.test.SimpleServiceImpl;
//import org.exoplatform.test.BookStoreService;


import juzu.Action;
import juzu.Path;
import juzu.Response;
import juzu.View;
import juzu.template.Template;

public class BookStorePorlet {
	//static Set<Book> listBooks = new HashSet<Book>();
	/*static Book book1= new Book("Doraemon",CATEGORY.COMICS, "truyen tranh doraemon Nhat Ban");
	static Book book2= new Book("Dragon Balls",CATEGORY.COMICS, "truyen tranh 7 vien ngoc rong Nhat Ban");
	static{
		listBooks.add(book1);
		listBooks.add(book2);
	}*/
	Collection<Book> listBooks;
	
	@Inject
	@Path("index.gtmpl")
	examples.tutorial.bookstore.templates.index index;
	
	
	BookStoreService iservice;
	
	@Inject
	public BookStorePorlet(BookStoreService iservice) {
		this.iservice=iservice;
	  	System.out.println(iservice);
	}
	
	@View
	public void index(){
		this.listBooks=iservice.getAllBook();
		index.
		  with().
		  listBooks(listBooks).
		  render();
	}
}

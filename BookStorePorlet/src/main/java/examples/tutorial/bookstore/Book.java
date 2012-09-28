package examples.tutorial.bookstore;

import java.util.concurrent.atomic.AtomicInteger;

public class Book {
  public enum CATEGORY {
    NOVEL, MANGA, COMICS, TECHNICAL, MATHS, HISTORY
  }
  private static final AtomicInteger sequence = new AtomicInteger();
  public final String id = "" + sequence.getAndIncrement();
  
  public String name;

  public CATEGORY category;

  public String content;
  
  public Book() {
  }
  
  public Book(String name, CATEGORY cat, String content) {
    this.name = name;
    this.category = cat;
    this.content = content;
  }
  
  public static String[] getBookCategoryStringArray() {
    return new String[] { "Comics", "History", "Manga", "Maths", "Novel", "Technical" };
  }
  
  public String getId() {
    return id;
  }

/*  public void setId(String id) {
    this.id = id;
  }*/

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CATEGORY getCategory() {
    return category;
  }

  public void setCategory(CATEGORY category) {
    this.category = category;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}

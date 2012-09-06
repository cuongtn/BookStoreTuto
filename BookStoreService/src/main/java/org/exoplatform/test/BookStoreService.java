/*
 * Copyright (C) 2012 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.exoplatform.test;

import java.util.List;

import org.exoplatform.test.entity.Book;
import org.exoplatform.test.entity.Book.CATEGORY;
import org.exoplatform.test.exception.BookNotFoundException;
import org.exoplatform.test.exception.DuplicateBookException;
import org.picocontainer.Startable;

/**
 * @author <a href="mailto:haithanh0809@gmail.com">Hai Thanh Nguyen</a>
 * @version $Id$
 * 
 */
public interface BookStoreService extends Startable
{
   public List<Book> getAllBook();

   public Book getBook(String id);

   public Book addBook(String bookName, CATEGORY category, String content) throws DuplicateBookException;

   public void deleteBook(String id) throws BookNotFoundException;

   public void deleteAll();

   public Book editBook(Book book) throws BookNotFoundException;

   public List<Book> searchName(String key);

   public boolean isExistBookName(String bookName);
}

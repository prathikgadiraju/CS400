import java.util.List;
import HashtableMap.HashtableHelper;

public class IBookMapper implements IBookMapperBackend {

  @Override
  /**
   * Adds a new book to the backend's database and is stored in
   * a hash table internally.
   * @param book the book to add
   */
  public void addBook(IBook book) {
    // TODO Auto-generated method stub
    
     /*
      
     if(hashTab[index] == null) {
       hashTab[index] = new HashtableHelper(key,value);
     }
     else {
       HashtableHelper top = hashTab[index];
       while(top.getNextElement() != null) {
         top = top.getNextElement();
       }
       top.setNextElement(new HashtableHelper(key,value));
     }
     setSize(size() + 1);
     reHashed();
     return true; */
    
  }

  @Override
  /**
   * Returns the number of books stored in the backend's database.
   * @return the number of books
   */
  public int getNumberOfBooks() {
    // TODO Auto-generated method stub
    
    return ;
  }

  @Override
  /**
   * This method can be used to set a filter for the author names
   * contained in the search results. A book is only returned as
   * a result for a search by title, it is also contains the string
   * filterBy in the names of its authors.
   * @param filterBy the string that the book's author names must contain
   */
  public void setAuthorFilter(String filterBy) {
    // TODO Auto-generated method stub
    
  }

  @Override
  /**
   * Returns the string used as the author filter, null if no author
   * filter is currently set.
   * @return the string used as the author filter, or null if none is set
   */
  public String getAuthorFilter() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  /**
   * Resets the author filter to null (no filter).
   */
  public void resetAuthorFilter() {
    // TODO Auto-generated method stub
    
  }

  @Override
  /**
   * Search through all the books in the title base and return books whose
   * title contains the string word (and that satisfies the author filter,
   * if an author filter is set).
   * @param word word that must be contained in a book's title in result set
   * @return list of books found
   */
  public List<IBook> searchByTitleWord(String word) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  /**
   * Return the book uniquely identified by the ISBN, or null if ISBN is not
   * present in the dataset.
   * @param ISBN the book's ISBN number
   * @return the book identified by the ISBN, or null if ISBN not in database
   */
  public IBook getByISBN(String ISBN) {
    // TODO Auto-generated method stub
    return null;
  }

}

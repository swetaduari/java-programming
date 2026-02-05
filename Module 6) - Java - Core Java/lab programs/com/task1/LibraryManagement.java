package com.task1;
import java.util.*;


class Book
{
	
	
	public int id;
	public String bookTitle;
	 public boolean isIssued;
	
	public Book(int id, String bookTitle)
	{
		this.id=id;
		this.bookTitle=bookTitle;
		this.isIssued= false;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public boolean isIssued() {
		return isIssued;
	}
	public void setIssued(boolean isIssued) {
		this.isIssued = isIssued;
	}
	
	
	
}
class  Library
{
	Book[] books;
	public static int bookCount;
	//int issue;
	
	//constructer
	
	Library()
	{
		this.books = new Book[100]; 
        this.bookCount = 0;
        //this.issue=a;
	}
	//add books 
	
	 public void addBook(int id, String bookTitle) 
	 {
	        if (bookCount < 100)
	        {
	            books[bookCount] = new Book(id, bookTitle);
	            bookCount++;
	            System.out.println("Book added successfully!");
	        } else
	        {
	            System.out.println("Cannot add more books. Library is full.");
	        }
	   }
	 //display book
	  public void displayBooks() 
	  {
	        if (bookCount == 0)
	        {
	            System.out.println("no books");
	            return;
	        }
	        for (int i = 0; i < bookCount; i++)
	        {
	            System.out.println(books[i].id);
	            System.out.println(books[i].bookTitle);
	            
	        }
	    }
	  
	  //issue book
	 /** public void issueBook(int id, String bookTitle, boolean isIssued )
	  {
		  if(isIssued==false)
		  {
			  isIssued=true;
              System.out.println("Book issued successfully!"); 
		  }
		 
	  }**/
	  
	  public void borrow(int issue)
	    {
		  
		  

	        for (int i = 0; i < bookCount; i++) 
	        {
	            if (issue == books[i].id) 
	            {
	            	  if(books[i].isIssued==false)
	            	  {
	                    System.out.println( "Book is Available.");
	                    books[i].isIssued=true;
	                   
	            	  }
	             }
	            
	            else
	            { 
	             System.out.println("Book is Unavailable");
	           
	            }
	           return; 
	        }

	       
	    }

	  //return book
	  public void returnBook(int sNo) {
	        
	        for (int i = 0; i < bookCount; i++) {
	            if (sNo == books[i].id) {
	                if (books[i].isIssued) {
	                    books[i].isIssued = false; 
	                    System.out.println("Book S.No: " + sNo + " returned successfully!");
	                    return;
	                } else {
	                    System.out.println("Error: Book S.No: " + sNo + " was not issued in the first place.");
	                    return;
	                }
	            }
	        }
	        System.out.println("Error: No book with S.No: " + sNo + " found.");
	    }

	  
	
}

public class LibraryManagement 
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		Library library = new Library();
		
		int choice;
	
		do {
			System.out.println("1.Add Book");
			System.out.println("2.Display book");
			System.out.println("3.Issue Book");
			System.out.println("4.Return Book");
			System.out.println("5.Exit");
			System.out.println("Enter Your Choice:");
			 choice = sc.nextInt();
			

			 switch (choice) {
             case 1:
                 System.out.print("Enter Book ID: ");
                 int id = sc.nextInt();
                 System.out.print("Enter Book Title: ");
                 String booktitle = sc.next();
                 
                 library.addBook(id,booktitle);
                 break;
             case 2:
            	 library.displayBooks();
            	 break;
             case 3:
            	 System.out.println("Enter the id of book");
            	 int a=sc.nextInt();
            	 library.borrow(a);
            	 break;
            	 //System.out.print("enter the id of book");
            	// int issue = sc.nextInt();
            	// library.issueBook();
             case 4:
            	 System.out.println("Enter the id");
            	 int sno=sc.nextInt();
            	 library.returnBook(sno);
            	 break;
            	 
             case 5:
                 System.out.println("Exiting");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
            	 
                
			 }
			
		}while(choice!= 5);
		
		

	
}
}


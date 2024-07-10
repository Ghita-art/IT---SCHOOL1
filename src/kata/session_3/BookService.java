package kata.session_3;

import java.util.ArrayList;
import java.util.List;

public class BookService {

    private List<Book> bookList = new ArrayList<>();
    private List<Member> memberList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void registerMember(Member member) {
        memberList.add(member);
    }
}
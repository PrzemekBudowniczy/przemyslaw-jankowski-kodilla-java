package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Task;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        // new library, new few books, add books to library
        // add to the test: shallowCopy & deepCopy
        Library library = new Library("BUW");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.books.add(new Book("Title " + n, "Author " + n, LocalDate.of(2022, 3, n))));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("cloned BUW - shallow");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("cloned BUW - deep");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.removeBook("Title 1");

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(4, library.getBooks().size());
        assertEquals(5, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks().size(), library.getBooks().size());
        assertNotEquals(clonedLibrary.getBooks().size(), deepClonedLibrary.getBooks().size());
    }
}

package com.twu.biblioteca;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookTest {

    @Test
    public void shouldReturnBookDetails() {
        Book book = new Book("The Monk Who Sold His Ferrari", "Robin Sharma", "2007");

        String actualDetails = book.toString();

        assertThat(actualDetails, is(equalTo("The Monk Who Sold His Ferrari, Robin Sharma, 2007")));
    }
}

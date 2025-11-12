package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(com.kodilla.rest.controller.BookController.class)
class BookControllerMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private com.kodilla.rest.service.BookService bookService;

    @Test
    void shouldAddBook() throws Exception {
        // given
        BookDto bookDto = new BookDto("Wiedźmin", "Andrzej Sapkowski");
        Gson gson = new Gson();
        String jsonContent = gson.toJson(bookDto);

        // when & then
        mockMvc.perform(post("/books")
                        .contentType("application/json")
                        .content(jsonContent))
                .andExpect(status().isOk());
    }
}
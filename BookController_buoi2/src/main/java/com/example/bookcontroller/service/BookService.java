package com.example.bookcontroller.service;

import com.example.bookcontroller.model.Book;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    public List<Book> getAllBooks() {
        try {
            // Sử dụng ClassPathResource để đọc file từ thư mục resources
            ClassPathResource resource = new ClassPathResource("books.json");
            InputStream inputStream = resource.getInputStream();

            // Đọc nội dung từ file và chuyển đổi thành List<Book>
            ObjectMapper objectMapper = new ObjectMapper();
            Book[] booksArray = objectMapper.readValue(inputStream, Book[].class);

            return Arrays.asList(booksArray);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}

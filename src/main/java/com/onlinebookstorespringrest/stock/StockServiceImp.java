package com.onlinebookstorespringrest.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinebookstorespringrest.book.Book;
import com.onlinebookstorespringrest.book.BookRepository;

@Service
public class StockServiceImp implements StockService {

	@Autowired
	StockRepository stockRepository;

	@Autowired
	BookRepository bookRepository;

	@Override
	public void addStock(Stock stock) {

		Book book = bookRepository.findById(stock.getAddStockForThisId());
		stock.setBook(book);
		stockRepository.save(stock);

	}

	@Override
	public Long checkStockByBookId(Long bookId) {
		Book book = bookRepository.findById(bookId);
		Stock stock = stockRepository.findByBook(book);

		return stock.getStockNumber();
	}

}

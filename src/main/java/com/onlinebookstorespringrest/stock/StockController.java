package com.onlinebookstorespringrest.stock;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {
	
	@Autowired
	StockService stockService;
	
	
	@RequestMapping(value = "/addstock", method = RequestMethod.POST)
	public void addStock(@RequestBody Stock stock) {
		
		stockService.addStock(stock);
		
	}
	
	@RequestMapping(value = "/checkstock/{book_id}", method = RequestMethod.GET)
	public Long checkStockById(@PathVariable("book_id") Long book_id) {
		
		return stockService.checkStockByBookId(book_id);
		
	}

}

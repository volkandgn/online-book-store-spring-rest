package com.onlinebookstorespringrest.stock;

public interface StockService {
	
	void addStock(Stock stock);
	Long checkStockByBookId(Long bookId);
	

}

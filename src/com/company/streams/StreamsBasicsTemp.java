package com.company.streams;

import com.company.domain.Trade;
import com.company.util.TradeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsBasicsTemp {

	List<Trade> trades = TradeUtil.createTrades();

	private List<Trade> findLargeTradesUsingPreJava8(List<Trade> trades) {
		List<Trade> largeTrades = new ArrayList<Trade>();
		for(Trade trade: trades){
			if(trade.getQuantity() > 10000 && trade.getInstrument().equals("IBM"))
				largeTrades.add(trade);
		}
		
		return largeTrades;
	}
	

	private void findLargeTradesUsingStreams(List<Trade> trades) {

		trades.parallelStream()
		.filter(trade -> trade.getQuantity() > 10000)
		.filter(Trade::isCancelledTrade)
		.limit(10)
		.distinct()
		.forEach(System.out::println);
		
	}

	private void testStream() {
	}

	public static void main(String[] args) {
		StreamsBasicsTemp basics = new StreamsBasicsTemp();
		basics.testStream();
	}

}

package com.company.streams.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.company.domain.Trade;
import com.company.util.TradeUtil;

// Streams Basics PART 2
public class StreamsBasics {
	// Collecting big trades using Streams
	private void findLargeTradesUsingStreams(List<Trade> trades) {
		
/*		List<Trade> largeTrades = trades.parallelStream()
			.filter(trade ->trade.getQuantity() > 10000)
			.filter(Trade::isCancelledTrade)
			.limit(10)
			.collect(Collectors.toList());
		
		System.out.println("Large trades: "+largeTrades);*/

		List<Trade> largeTrade = trades.parallelStream()
				.filter(trade -> trade.getQuantity() > 1000)
				.filter(trade -> trade.getStatus().equals("CANCEL"))
				.filter(trade -> trade.getInstrument().equals("GOOG"))
				.collect(Collectors.toList());

		largeTrade.forEach(trade -> System.out.println(trade));
	}

	private List<Trade> findLargeTradesUsingPreJava8(List<Trade> trades) {
		List<Trade> largeTrades = new ArrayList<Trade>();
		// Logic for collecting the large trades

		for (Trade trade : trades) {
			if (trade.getQuantity() > 10000
					&& trade.getStatus().equals("CANCELLED")
					&& trade.getInstrument().equals("GOOGL"))
				largeTrades.add(trade);
		}
		return largeTrades;
	}

	public static void main(String[] args) {
		StreamsBasics basics = new StreamsBasics();
		List<Trade> trades = TradeUtil.createTrades();
//		basics.findLargeTradesUsingPreJava8(trades);
		basics.findLargeTradesUsingStreams(trades);
		
	}

}

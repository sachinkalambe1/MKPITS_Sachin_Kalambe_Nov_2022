package com.mkpits.Trading.service.impl;

import com.mkpits.Trading.dto.TradingDataDto;
import com.mkpits.Trading.service.TradingDataService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Qualifier
@Service
public class TradingDataDummyServiceImpl implements TradingDataService {

    @Override
    public List<TradingDataDto> getTradingData() {
        List<TradingDataDto>tradingdatadtoList=new ArrayList<>();
        TradingDataDto tradingdataDtoList1= TradingDataDto.builder()
                .fiftyWeekHigh(900.00)
                .FiftyWeekLow(313.454)
                .scripeName("Sachin")
                .currentPrice(400)
                .build();

        TradingDataDto tradingdataDtoList2= TradingDataDto.builder()
                .fiftyWeekHigh(900.00)
                .FiftyWeekLow(313.454)
                .scripeName("Sachin")
                .currentPrice(400)
                .build();

        TradingDataDto tradingdataDtoList3= TradingDataDto.builder()
                .fiftyWeekHigh(900.00)
                .FiftyWeekLow(313.454)
                .scripeName("Sachin")
                .currentPrice(400)
                .build();

        TradingDataDto tradingdataDtoList4= TradingDataDto.builder()
                .fiftyWeekHigh(900.00)
                .FiftyWeekLow(313.454)
                .scripeName("Sachin")
                .currentPrice(400)
                .build();

        tradingdatadtoList.add(tradingdataDtoList1);
        tradingdatadtoList.add(tradingdataDtoList2);
        tradingdatadtoList.add(tradingdataDtoList3);
        tradingdatadtoList.add(tradingdataDtoList4);
        return tradingdatadtoList;

    }
}

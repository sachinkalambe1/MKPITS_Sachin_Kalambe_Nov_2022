package com.mkpits.Trading.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TradingDataDto {
    private long id;
    private double fiftyWeekHigh;
    private double FiftyWeekLow;
    private double currentPrice;
    private String scripeName;

}

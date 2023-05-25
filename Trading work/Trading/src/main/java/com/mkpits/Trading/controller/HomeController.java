package com.mkpits.Trading.controller;

import com.mkpits.Trading.dto.TradingDataDto;
import com.mkpits.Trading.service.TradingDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    public TradingDataService tradingDataService;
    @GetMapping("/")
    public String Home(Model model){

        return "index";
    }
    @GetMapping("/dashboard")
    public String dashboard(Model model){
        List<TradingDataDto> tradingDataDtoList = tradingDataService.getTradingData();

        model.addAttribute("trading",tradingDataDtoList);
        return "dashboard";
    }
}

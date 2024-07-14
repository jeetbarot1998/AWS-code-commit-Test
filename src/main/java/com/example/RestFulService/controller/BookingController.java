package com.example.RestFulService.controller;

import com.example.RestFulService.model.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController()
@RequestMapping(path = "/cinema")
public class BookingController {
    List<Ticket> ticketList = new ArrayList<>(Arrays.asList(
            new Ticket("ABC", 10, "My cinema")
    ));


    @PostMapping(path = "/ticket")
    public Ticket addTicket(@RequestBody Ticket ticket){
        ticketList.add(ticket);
        return ticket;
    }

    @GetMapping(path = "/ticket")
    public List<Ticket> getAllTickets(){
        return ticketList;
    }

    @GetMapping(path = "/ticket/{id}")
    public List<Ticket> getTicket(@RequestParam int id){
        System.out.println("Received RequestParam as  " + id);
        return ticketList;
    }



}

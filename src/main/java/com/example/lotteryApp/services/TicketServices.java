package com.example.lotteryApp.services;

import com.example.lotteryApp.entity.Ticket;
import com.example.lotteryApp.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServices {

    private final TicketRepository ticketRepository;

    public TicketServices(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

}

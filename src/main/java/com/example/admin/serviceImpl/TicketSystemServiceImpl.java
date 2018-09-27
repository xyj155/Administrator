package com.example.admin.serviceImpl;

import com.example.admin.bean.TicketSystem;
import com.example.admin.dao.TicketSystemMapper;
import com.example.admin.service.TicketSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketSystemServiceImpl implements TicketSystemService {
    @Autowired
    private TicketSystemMapper mapper;
    @Override
    public List<TicketSystem> getAllTicketSystem() {
        return mapper.getAllTicketSystem();
    }
}

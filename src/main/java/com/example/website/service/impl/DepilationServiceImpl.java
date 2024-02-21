package com.example.website.service.impl;

import com.example.website.entity.Depilation;
import com.example.website.repository.DepilationRepository;
import com.example.website.service.DepilationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepilationServiceImpl implements DepilationService {
    DepilationRepository depilationRepository;
    @Override
    public Depilation create() {
        return null;
    }
}

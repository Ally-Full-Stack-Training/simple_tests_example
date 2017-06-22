package com.example.demo.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.util.Data;

public interface DataRepo extends PagingAndSortingRepository<Data, Long>{

}
package com.movie.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movie.bean.MovieCRUD;
import com.movie.dao.MovieCRUDDAO;



@RestController
@CrossOrigin("http://localhost:4200/")
public class MovieController {
	
	@Autowired
    MovieCRUDDAO dao;
    
    @PostMapping("/PerformInsert")
    public void performInsert(@RequestBody MovieCRUD mov) {
        dao.save(mov);
    }
    
    @GetMapping("/ViewAll")
	public List<MovieCRUD> getAll() {
		Iterator<MovieCRUD> it =  dao.findAll().iterator();
		List<MovieCRUD> list = new ArrayList<MovieCRUD>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
    
    @PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody MovieCRUD bean) {
		dao.save(bean);
		
	}
	

    @DeleteMapping("/PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	
	}

}

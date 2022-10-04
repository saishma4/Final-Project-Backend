package com.ivyprograd.dollza.contollers;

import java.io.IOException;
import java.util.List;

import com.ivyprograd.dollza.models.Dolls;
import com.ivyprograd.dollza.repository.ProductDollRepository;
import com.ivyprograd.dollza.services.ProductDollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/auth/")
public class ProductDollController {

  @Autowired
  private ProductDollService productDollService;


    @GetMapping("/dolls")
    public List<Dolls> list() {
        return productDollService.getDollsList();
    }

//
//    @GetMapping("/dolls/{dollname}" )
//    public Dolls getImage(@PathVariable("dollname") String dollname) throws IOException {
//    }



}

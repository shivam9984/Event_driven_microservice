package com.product.service.rest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("/get/{id}")
    public String getProduct(@PathVariable("id") Integer id)
    {
        return "HTTP GET HANDLED"+id;
    }
    @PostMapping("/post")
    public String getProduct()
    {
        return "HTTP POST HANDLED";
    }
    @PutMapping("/update/{id}")
    public String getProductupdate(@PathVariable("id") Integer id)
    {
        return "HTTP UPDATE HANDLED"+id;
    }
    @DeleteMapping("delete/{id}")
    public String deleteProduct(@PathVariable("id") Integer id)
    {
        return "HTTP DELETE HANDLED"+id;
    }

}

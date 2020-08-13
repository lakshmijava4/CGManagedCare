package com.qdm.cg.common.controller;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qdm.cg.common.exception.ResourceNotFoundException;
import com.qdm.cg.common.model.Product;
import com.qdm.cg.common.model.User;
import com.qdm.cg.common.service.ProductService;
import com.qdm.cp.common.repositry.SkillRepository;
import com.qdm.cp.model.Skills;

@RestController
@RequestMapping("/api/cg")
public class ProductController {

	@Autowired
	ProductService service;

	@Autowired
	SkillRepository skillservice;

	// CP Get All Skills
	@GetMapping("/api/cg/skills")
	public List<Skills> getAllSkill() {
		return skillservice.findByAll();

	}

	// GetCGRecommend Products
	@GetMapping("/api/cg/{id}")
    public ResponseEntity<Product> getSendCGRecommendation(@PathVariable(value = "id") Integer productId)
        throws ResourceNotFoundException {
		Product product = service.findById(productId)
          .orElseThrow(() -> new ResourceNotFoundException("productId not found for this id :: " + productId));
        return ResponseEntity.ok().body(product);
    }
	

	@GetMapping("/api/cg/{activity}")
	public Product getCGActivityStatus() {
		return service.getCGActivity().get(0);

	}

	// GetListMaritalStatus
	@GetMapping("/api/cg/marital/{emstaus}")
		 public List<User> getMaritalStatus(String status) {
		List<User>users=new LinkedList<>();
		users.addAll(users);
			return users;
		      

	}

	// GetList Emotional Status
	@GetMapping("/api/cg/marital/{emstatusId}")
	public List<String> getEmotionalStatus(String str) {
		List<String> emationList=new LinkedList<>();
		for (String ref : emationList) {
			emationList.add(0, ref);
		}
		return emationList;

	}

	// GetCGRecommend Equip
	@GetMapping("/api/cg/{tripid}")
	public List<String> getCGRecommendEquip() {
		List<String> list = new LinkedList<>();
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
		}
		return list;

	}

	// Get List Financial Status
	@GetMapping("/api/cg/fnstaus/{id}")
	public List<Product> financialStatus() {
		return service.financialNotification(null);

	}

}

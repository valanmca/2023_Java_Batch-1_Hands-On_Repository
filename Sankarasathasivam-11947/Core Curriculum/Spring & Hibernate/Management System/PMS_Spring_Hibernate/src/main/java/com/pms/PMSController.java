package com.pms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.bean.Product;
import com.pms.dao.ProductDAO;

@Controller
public class PMSController {
	@Autowired
	ProductDAO dao;

	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@RequestMapping("Welcome")
	public ModelAndView loadWelcome() {
		ModelAndView mv = new ModelAndView("Welcome");
		return mv;
	}

	@RequestMapping("Front")
	public ModelAndView loadFront() {
		ModelAndView mv = new ModelAndView("Front");
		return mv;
	}

	@RequestMapping("InsertProduct")
	public ModelAndView loadInsertProduct() {
		ModelAndView mv = new ModelAndView("InsertProduct");
		return mv;
	}

	@RequestMapping("performInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Product bean) {

		ModelAndView mv = new ModelAndView("InsertProductSuccess");
		try {
			dao.insertProduct(bean);

			mv.addObject("bean", bean);
			mv.setViewName("InsertProductSuccess");

		} catch (Exception e) {
			mv.setViewName("InsertProductFailed");
		}
		return mv;
	}

	@RequestMapping("UpdateProduct")
	public ModelAndView loadUpdateProduct() {
		ModelAndView mv = new ModelAndView("UpdateProduct");
		return mv;
	}

	@RequestMapping("performUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Product bean) {

		ModelAndView mv = new ModelAndView("UpdateProductSuccess");
		try {
			dao.updateProduct(bean);

			mv.addObject("bean", bean);
			mv.setViewName("UpdateProductSuccess");

		} catch (Exception e) {
			mv.setViewName("UpdateProductFailed");
		}
		return mv;
	}

	@RequestMapping("DeleteProduct")
	public ModelAndView loadDeleteProduct() {
		List<Integer> list = dao.getIdList();

		ModelAndView mv = new ModelAndView("DeleteProduct");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("performDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Product bean) {
		dao.deleteProduct(bean);
		ModelAndView mv = new ModelAndView("DeleteProductSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("FindProduct")
	public ModelAndView loadFindProduct() {
		List<Integer> list = dao.getIdList();

		ModelAndView mv = new ModelAndView("FindProduct");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("performFind")
	public ModelAndView performFind(@ModelAttribute("bean") Product bean) {
		Product stu = dao.findProduct(bean);
		ModelAndView mv = new ModelAndView("FindProductSuccess");
		mv.addObject("bean", stu);
		return mv;
	}

	@RequestMapping("FindAllProduct")
	public ModelAndView loadFindAllProduct() {
		List<Product> List = dao.getProduct();
		ModelAndView mv = new ModelAndView("FindAllProduct");
		mv.addObject("idList", List);
		return mv;
	}

}

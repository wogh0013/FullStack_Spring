package com.woori.myhome.gallery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GalleryController {
	@RequestMapping("/gallery/list")
	String gallery_list()
	{
		return "gallery/gallery_list";
	}
	
	@RequestMapping("/gallery/write")
	String gallery_write(Model model)
	{
		
		GalleryDto dto = new GalleryDto();
		model.addAttribute("galleryDto", dto);
		
		return "gallery/gallery_write";
	}
//	
//	@RequestMapping("/gallery/view")
//	String gallery_view()
//	{
//		return "gallery/gallery_view";
//	}
}

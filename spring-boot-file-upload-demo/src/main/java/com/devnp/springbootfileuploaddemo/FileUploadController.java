package com.devnp.springbootfileuploaddemo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class FileUploadController {

	@GetMapping("/")
    public String listUploadedFiles(Model model) throws IOException {
		
		return "uploadForm" ;
	}
	
	
	@PostMapping("/upload")
    public String upload(@RequestParam("avatar") MultipartFile file,
            RedirectAttributes redirectAttributes, Model model) throws IOException {
		
		List<String> msg = new ArrayList<>();
		
		FileCopyUtils.copy(file.getBytes(), new File("D:/temp/" + file.getOriginalFilename()));
		
		msg.add("You successfully uploaded " + file.getOriginalFilename() + "!");
		
		model.addAttribute("messages", msg);
		
		return "uploadMessage" ;
	}
	
	@PostMapping("/uploads")
    public String upload(@RequestParam("files") MultipartFile[] files, Model model) throws IOException {
		
		List<String> msg = new ArrayList<>();
		
		for(int i = 0; i< files.length; i++ ) {
			
			if(!StringUtils.isEmpty(files[i].getOriginalFilename())) {
				FileCopyUtils.copy(files[i].getBytes(), new File("D:/temp/" + files[i].getOriginalFilename()));
			
				msg.add("You successfully uploaded " + files[i].getOriginalFilename() + "!");
			}
		}
		
		model.addAttribute("messages", msg);
		
		return "uploadMessage" ;
	}
}

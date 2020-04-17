package com.cg.web;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DownloadController {

	@RequestMapping("download.htm")
	public void downloadPdf(HttpServletResponse response) throws IOException {
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment;filename=mypdf.pdf");
		FileInputStream fis = 
				new FileInputStream("f:\\books\\softwarebook\\effectivekotlin-sample.pdf");
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] arr = new byte[fis.available()];
		bis.read(arr);
		ServletOutputStream out = response.getOutputStream();
		out.write(arr);
		out.close();
		bis.close();
		fis.close();
		
	}
}

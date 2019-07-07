package com.mitocode.beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mitocode.dao.PersonaDAO;
import com.mitocode.dao.PersonaDAOImpl;
import com.mitocode.model.Persona;

@WebServlet("/imagen/*")
public class ImageServlet extends HttpServlet {

	private PersonaDAO dao;

	public ImageServlet() {
		dao = new PersonaDAOImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { //
		int id = Integer.parseInt(req.getPathInfo().substring(1));
		Persona per;
		
		try {
			per = dao.listarPorId(id);
			resp.setContentType(getServletContext().getMimeType(per.getApellidos()));
			resp.setContentLength(per.getFoto().length);
			resp.getOutputStream().write(per.getFoto());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

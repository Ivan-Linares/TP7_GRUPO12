package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.SegurosDao;
import dao.TipoSegurodao;
import dominio.Tiposeguro;

@WebServlet("/servlet")
public class servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if (request.getParameter("parametro")!= null) {
			SegurosDao sdao= new SegurosDao();
			int idnuevo=0;
			idnuevo=(sdao.UltimoID())+1;
			
			request.setAttribute("valorid", idnuevo);
			RequestDispatcher rd= request.getRequestDispatcher("AgregarSeguro.jsp");
			rd.forward(request, response);
		}/*
		if (request.getParameter("p2")!= null) {
			TipoSegurodao segdao= new TipoSegurodao();
			ArrayList<Tiposeguro> lista= new ArrayList<Tiposeguro>();
			lista=segdao.ListarTiposdeSeguros();
			
			request.setAttribute("valorTipo", lista);
			RequestDispatcher rd1= request.getRequestDispatcher("AgregarSeguro.jsp");
			rd1.forward(request, response);
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

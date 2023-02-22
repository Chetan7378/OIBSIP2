package My_Pack;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cancel
 */
public class Cancel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cancel() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Connection con=DbConnection.connect();
		Long pnr =Long.parseLong(request.getParameter("pnr"));
		
		try {
			PreparedStatement ts=con.prepareStatement("select * from reser where pnr=? and email=?");
			ts.setLong(1, pnr);
			ts.setString(2, GetSet.getEmail());
			
			ResultSet s=ts.executeQuery();
			while(s.next()){
				PreparedStatement l=con.prepareStatement("delete from reser where pnr=?");	
				l.setLong(1, pnr);
				int i=l.executeUpdate();
				if(i>0){
					response.sendRedirect("try.html");
				}else
				{
					response.sendRedirect("cancel.html");
				}
				
				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

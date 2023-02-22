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
 * Servlet implementation class Reserve
 */
public class Reserve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Reserve() {
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
		int rid=0;
		String name=request.getParameter("name");
		String email;
		Long trainnum=Long.parseLong(request.getParameter("trainnum"));
		GetSet.setTrainnum(trainnum);
		String trainname;
		Long mobile=Long.parseLong(request.getParameter("mobile"));
		String from=request.getParameter("from");
		String to=request.getParameter("to");
		String reservation=request.getParameter("reservation");
		String berth=request.getParameter("berth");
		Long pnr;
		String date=request.getParameter("date");
		String gender=request.getParameter("gender");
		int min=10000;
		int max=9999999;
		int  randomnum=(int) (Math.random()*(max-min+1)+min);	
		pnr=(long) randomnum;
		
		try {
			PreparedStatement ps=con.prepareStatement("select name from fetchname where trainnum=?");
			ps.setLong(1, GetSet.getTrainnum());
			ResultSet b=ps.executeQuery();
			while(b.next()){
				trainname=b.getString(1);
				
				PreparedStatement n=con.prepareStatement("insert into reser values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
				n.setInt(1, rid);
				n.setString(2, name);
				n.setString(3, GetSet.getEmail());
				n.setLong(4,trainnum);
				n.setString(5, trainname);
				n.setLong(6, mobile);
				n.setString(7, from);
				n.setString(8, to);
				n.setString(9, reservation);
				n.setString(10, berth);
				n.setString(11, gender);
				n.setLong(12, pnr);
				n.setString(13, date);
				
				int i=n.executeUpdate();
				if (i>0){
					response.sendRedirect("admin.html");
					
				}else
				{
					response.sendRedirect("admin.html");
				}
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
//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
}

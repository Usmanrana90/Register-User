

package GNServlet;


import GNAction.RegAction;
import GNBean.RegBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String city=request.getParameter("city");
        String mob=request.getParameter("mobile");
        String password=request.getParameter("password");
        
        long mobile=Long.parseLong(mob);
        
        RegBean data=new RegBean();
        data.setName(name);
        data.setEmail(email);
        data.setCity(city);
        data.setMobile(mobile);
        data.setPassword(password);
        
         RegAction  ra=new RegAction();
           int i=ra.InsertRegRecord(data);
           if(i>0)
           {
               response.sendRedirect("RegSucess.jsp");
           
           }
           else
           {
            response.sendRedirect("RegFailure.jsp");
           
           }
        }
        catch(Exception e)
        {
        
        
        }
    }


}

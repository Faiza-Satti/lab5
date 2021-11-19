package filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(filterName = "DataFilter")
public class DataFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

        String firstname = request.getParameter("fName");
        String lastname = request.getParameter("lName");
        String gender = request.getParameter("gender");
        String city = request.getParameter("city");
        String country = request.getParameter("country");

        boolean active;
        if(request.getParameter("Checking") == null)
            active = false;
        else
            active = true;
        //String erpg = "eroor.jsp";

        if (firstname == null || "".equals(firstname)
                || lastname == null || "".equals(lastname)
                || gender == null || "".equals(gender)
                || city == null || "".equals(city)
                || country == null || "".equals(country)
                || active == false) {

            request.setAttribute("errMsg", "Fields are empty");
        } else {
            chain.doFilter(request, response);
        }
    }
}

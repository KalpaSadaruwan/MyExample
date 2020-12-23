package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.User_payments;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cheque payments</h1>\n");
      out.write("        ");

            int balance = 10000;
            int in1 = 10000;

            int in2 = 10000;
            int in3 = 10000;
            int in4 = 10000;
        
      out.write("\n");
      out.write("        <h1>Avalable Balance </h1>\n");
      out.write("\n");
      out.write("        <form action=\"Payments\" method=\"POST\">\n");
      out.write("            Customer Name  <input type=\"text\" name=\"cname\">\n");
      out.write("            Invoice ID  <input type=\"text\" name=\"iid\">\n");
      out.write("            Cheque No  <input type=\"number\" name=\"cnumber\">\n");
      out.write("\n");
      out.write("            Payment<input type=\"number\" name=\"payment\">\n");
      out.write("            <input type=\"submit\" value=\"Submit\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            String a = "";
            try {
                String ino = request.getParameter("cheqno");
                System.out.println(ino);
                ServletContext context = getServletContext();
                ArrayList<User_payments> user = null;
                if (context.getAttribute("ud") != null) {
                    user = (ArrayList<User_payments>) context.getAttribute("ud");

                } else {
//           System.out.println("kalpa");
                }
                for (User_payments l : user) {
                    if(l.getInvoiceid().equals(ino)){
                        System.out.println("Okkkkkkkk");
                        in1=in1-Integer.parseInt(l.getPayment());
                    }
                    System.out.println(l.getInvoiceid());
                    System.out.println(ino);
                    a = l.getInvoiceid();
//                      if(l.getInvoiceid()==cno){

//                    System.out.println(l.getCnumber());
//                    System.out.println(l.getInvoiceid());
//                    System.out.println(l.getPayment());
//                    System.out.println(l.getUname());

out.write("<table>");
out.write("<tr>");
                                out.write("<td>");
                                out.write(l.getUname());
                                out.write("</td>");
                                out.write("<td>");
                                out.write(l.getInvoiceid());
                                out.write("</td>");
                                out.write("<td>");
                                out.write(l.getCnumber());
                                out.write("</td>");
                                out.write("<td>");
                                out.write(l.getPayment());
                                out.write("</td>");
                                out.write("</tr>");
                                out.write("<br>");
                                out.write("</table>");
//                    out.write(l.getUname());
//
//                    out.write(l.getInvoiceid());
//
//                    out.write(l.getCnumber());
//
//                    out.write(l.getPayment());
//                    out.write("</br>");
                    //    }  else{
                    //    out.write("wrong");
                }
                System.out.println(a);
//                }

            } catch (Exception e) {
            }

        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>IN001 ");
      out.print(in1);
      out.write("</h1>\n");
      out.write("        <h1>IN002  ");
      out.print(in2);
      out.write("</h1><br>\n");
      out.write("        <h1>IN003  ");
      out.print(in3);
      out.write("</h1><br>\n");
      out.write("        <h1>IN004  ");
      out.print(in4);
      out.write("</h1><br>\n");
      out.write("\n");
      out.write("        <div></div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

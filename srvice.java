/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
public class srvice extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
         PrintWriter p=response.getWriter();
        if(request.getParameter("Login") !=null)
        {
            p.println("<head>\n" +
"<style>\n" +
"\n" +
" #r:hover{background-color:black;\n" +
"  font-family: Microsoft Sans Serif;\n" +
"  font-size: large;\n" +
"  font-style: oblique;\n" +
"  color:#00ccff;\n" +
" }\n" +
" \n" +
" .flex-container {\n" +
"    display: -webkit-flex;\n" +
"    display: flex;\n" +
"    -webkit-flex-flow: row wrap;\n" +
"    flex-flow: row wrap;\n" +
"    text-align: center;\n" +
"}\n" +
"\n" +
".flex-container > * {\n" +
"    padding: 15px;\n" +
"    -webkit-flex: 1 100%;\n" +
"    flex: 1 100%;\n" +
"}\n" +
"header {background: orange;color:white;}\n" +
"footer {background: #aaa;color:white;}\n" +
" \n" +
" </style>\n" +
" \n" +
"  <script>\n" +
"            $(document).ready(function(){\n" +
"                $(\"#pass\").click(function(){\n" +
"                    if ($(\"#txt\").attr('type')=='password') {\n" +
"                        $(\"#txt\").attr('type','text');\n" +
"                    }\n" +
"                    else\n" +
"                    {\n" +
"                        $(\"#txt\").attr('type','password');\n" +
"                    }\n" +
"                });\n" +
"            });\n" +
"        </script>\n" +
"\n" +
"</head>\n" +
"<body style=\"background:#99ccff\">\n" +
" <div class=\"flex-container\">\n" +
"<header><center>\n" +
"    <img src=\"IMAGE/niit-cloud-campus-logo.png\" alt=\"\" style=\"float: left\"/>\n" +
"    <h1 style=\"Color:blue;\"><b>NIIT</b></h1>\n" +
"        <H5 style=\"color:blue\">Sapru Marg Lucknow</H5></center>\n" +
"</header>     \n" +
"<a href=\"index.html\">Home</a>\n" +
"	</div>	\n" +
"	\n" +
"<center>\n" +
"<h1 style =\"color: graytext;font-size:30pt;font-family:algertian;text-align:Center\">Login Page</h1>\n" +
"<div><form action='login.jsp' method='post'>\n" +
"<table cellspacing=\"5\" cellpadding=\"5\">\n" +
"<tr><td>Student Id </td> <td><input type='text' id=\"u\" placeholder=\"username\" name='si'><br></td></tr> \n" +
"<tr><td>Password</td> <td><input type='password' id=\"p\" placeholder=\"password\" name='ps'>&nbsp;&nbsp;<input type=\"checkbox\" id=\"pass\" value=\"show\">show<br></td></tr> \n" +
"<tr><td><input type='submit' id=\"r\" value='Login'></td>\n" +
"<td><input type='reset' id=\"r\" value='Clear'></td></tr>\n" +
"</table>\n" +
"</form>\n" +
" </div>\n" +
"</center>\n" +
"</div>\n" +
"<br><br><br><br><br><br><br><br><br><br><br><br><br>\n" +
"<div style=\"background-color: black; color:#99ccff \" id=\"foot\">\n" +
"        <tfoot>\n" +
"        <marquee behavior=\"scroll\" direction=\"left\" scrollamount=\"15\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\">\n" +
"            Develpoer-Arun yadav, Mobile-8400929483, Emial-arunyadav7438@gmail.com,      Like_us_on-\n" +
"            <a href=\"https://www.facebook.com/\">\n" +
"                <img src=\"IMAGE/logo/images.png\" alt=\"\" style=\"hov\"  height=\"30\" width=\"30\"/>\n" +
"            </a>\n" +
"            <a href=\"https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier\">\n" +
"                <img src=\"IMAGE/logo/gmail-icon-e1350056184536.png\" alt=\"\"  height=\"30\" width=\"30\"/>\n" +
"            </a>   \n" +
"            <a href=\"https://twitter.com/login\">\n" +
"                <img src=\"IMAGE/logo/twitter-logo_318-40209.jpg\" alt=\"\" height=\"30\" width=\"30\"/>\n" +
"            </a>\n" +
"            <a href=\"whatsapp.html\">\n" +
"                <img src=\"IMAGE/logo/download.png\" alt=\"\" height=\"30\" width=\"30\"/>\n" +
"            </a>\n" +
"        </marquee>\n" +
"         </tfoot> \n" +
"    </div>\n" +
"            <center><footer>NIIT Sapru Marg Lucknow</footer></center>\n" +
"</body>");
        }
        if(request.getParameter("register")!=null)
        {
            p.println("<html>\n" +
"    <head>\n" +
"        \n" +
"		<style>\n" +
"				#s:hover{background-color:black;\n" +
"				 font-family: Microsoft Sans Serif;\n" +
"				font-size: large;\n" +
"				font-style: oblique;\n" +
"				color:#00ccff;\n" +
"				}\n" +
"				#r:hover{background-color:black;\n" +
"				font-family: Microsoft Sans Serif;\n" +
"					font-size: large;\n" +
"					font-style: oblique;\n" +
"					color:#00ccff;\n" +
"					\n" +
"				}\n" +
"				\n" +
"				 .flex-container {\n" +
"    display: -webkit-flex;\n" +
"    display: flex;\n" +
"    -webkit-flex-flow: row wrap;\n" +
"    flex-flow: row wrap;\n" +
"    text-align: center;\n" +
"}\n" +
"\n" +
".flex-container > * {\n" +
"    padding: 15px;\n" +
"    -webkit-flex: 1 100%;\n" +
"    flex: 1 100%;\n" +
"}\n" +
"header {background: orange;color:white;}\n" +
"footer {background: #aaa;color:white;}\n" +
"		</style>\n" +
"		\n" +
"		 <script>\n" +
"           \n" +
"           function Data()\n" +
"		   {\n" +
"				alert(\"Registration succesfull\");\n" +
"		   } \n" +
"        </script>\n" +
"\n" +
"    </head>\n" +
"    <body style=\"background:#99ccff\">\n" +
"	   \n" +
"	<div class=\"flex-container\">\n" +
"<header><center>\n" +
"    <img src=\"IMAGE/niit-cloud-campus-logo.png\" alt=\"\" style=\"float: left\"/>\n" +
"    <h1 style=\"color:blue\">NIIT</h1>\n" +
"        <H5 style=\"color:blue\">Sapru Marg Lucknow</H5></center>\n" +
"</header>     \n" +
"	</div>		\n" +
"			<h1  style =\"color: graytext;font-size:30pt;font-family:algertian;text-align:Center\"><u>Registration</u></h1>\n" +
"        <form action=\"ragister\" method=\"post\" onsubmit=\"Data() \">\n" +
"        <center>\n" +
"        <table cellspacing=\"5\" cellpadding=\"5\">\n" +
"            <tr>\n" +
"                <td><b>Enter Your FirstName:</b></td>\n" +
"                &nbsp;\n" +
"                <td><input type=\"text\" name=\"fn\" placeholder=\"enter your firstname\" required/`></td>\n" +
"            </tr>\n" +
"			<tr>\n" +
"                <td><b>Enter Your LastName:</b></td>\n" +
"                &nbsp;\n" +
"                <td><input type=\"text\" name=\"ln\" placeholder=\"enter your lastname\" required/`></td>\n" +
"            </tr>\n" +
"			 <tr>\n" +
"                <td><b>Your Email</b></td>\n" +
"                \n" +
"                <td><input type=\"email\" name=\"em\" placeholder=\"email\" required/></td>\n" +
"            </tr>\n" +
"			 <tr>\n" +
"                <td><b>Student id</b></td>\n" +
"                \n" +
"                <td><input type=\"text\" name=\"si\" placeholder=\"username\" required/></td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td><b>Your Password</b></td>\n" +
"                \n" +
"                <td><input type=\"password\" name=\"ps\" placeholder=\"password\" required/></td>\n" +
"            </tr>\n" +
"\n" +
"            <tr>\n" +
"                <td><b>Enter your Address:</b></td>\n" +
"                \n" +
"                <td><textarea rows=\"4\"  cols=\"25\" name=\"ad\" placeholder=\"Address\" required></textarea></td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td><b>Select your Gender:</b></td>\n" +
"                <td><input type=\"radio\" name=\"G\">Male</td>\n" +
"                <td><input type=\"radio\" name=\"G\">FeMale</td>\n" +
"            </tr>\n" +
"            <tr>\n" +
"                <td><b>Enter your Date of Birth:</b></td>\n" +
"                <td><input type=\"date\" name=\"date\" required></td>\n" +
"            </tr>\n" +
"           <tr>\n" +
"                <td><b>Enter your Contact number:</b></td>\n" +
"                \n" +
"                <td><input type=\"text\" name=\"cn\" placeholder=\"Mobile Number\" required></td>\n" +
"            </tr>\n" +
"           <tr>\n" +
"                <td></td>\n" +
"                \n" +
"                <td><input type=\"checkbox\" name=\"gender\" required/>I aggre with T&C.\n" +
"                    </td>\n" +
"            </tr>\n" +
"\n" +
"           \n" +
"            <tr>\n" +
"                <td></td>\n" +
"                <td><center><input type=\"submit\" id=\"s\" value=\"Sumbit\" onsubmit=\"Data()\">&nbsp;&nbsp;<input type=\"Reset\" id=\"r\"></center/></td>\n" +
"            </tr>\n" +
"            \n" +
"        </table>\n" +
"        </center>\n" +
"        </form>\n" +
"		<div style=\"background-color: black; color:#99ccff \" id=\"foot\">\n" +
"        <tfoot>\n" +
"        <marquee behavior=\"scroll\" direction=\"left\" scrollamount=\"15\" onmouseover=\"this.stop();\" onmouseout=\"this.start();\">\n" +
"            Develpoer-Arun yadav, Mobile-8400929483, Emial-arunyadav7438@gmail.com,      Like_us_on-\n" +
"            <a href=\"https://www.facebook.com/\">\n" +
"                <img src=\"IMAGE/logo/images.png\" alt=\"\" style=\"hov\"  height=\"30\" width=\"30\"/>\n" +
"            </a>\n" +
"            <a href=\"https://accounts.google.com/ServiceLogin?sacu=1&scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false#identifier\">\n" +
"                <img src=\"IMAGE/logo/gmail-icon-e1350056184536.png\" alt=\"\"  height=\"30\" width=\"30\"/>\n" +
"            </a>   \n" +
"            <a href=\"https://twitter.com/login\">\n" +
"                <img src=\"IMAGE/logo/twitter-logo_318-40209.jpg\" alt=\"\" height=\"30\" width=\"30\"/>\n" +
"            </a>\n" +
"            <a href=\"whatsapp.html\">\n" +
"                <img src=\"IMAGE/logo/download.png\" alt=\"\" height=\"30\" width=\"30\"/>\n" +
"            </a>\n" +
"        </marquee>\n" +
"         </tfoot> \n" +
"    </div>\n" +
"            <center><footer>NIIT Sapru Marg Lucknow</footer></center>\n" +
"\n" +
"    </body>\n" +
"</html>");
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

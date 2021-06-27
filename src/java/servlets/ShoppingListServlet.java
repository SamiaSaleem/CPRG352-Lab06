/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 816386
 */
public class ShoppingListServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       HttpSession session = request.getSession() ;    
      
       String username = (String)session.getAttribute("username");
       
        String action = request.getParameter("action");
        
        if (action != null && action.equals("logout")) {
            session.invalidate();
               getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);

        }
        if (action != null && action.equals("register")) {
         
            session = request.getSession();
                getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);

        }
        if (action != null && action.equals("add")) {
         ArrayList<String> items = (ArrayList<String>)session.getAttribute("items");
      
        if (items == null)
            items = new ArrayList<>();
        
     
        if (request.getParameter("item") != null) {
            String item = request.getParameter("item");
            items.add(item);
            
            // store the list back into the session
            session.setAttribute("items", items);
        }
           

       }

          
              getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);

    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

   


}

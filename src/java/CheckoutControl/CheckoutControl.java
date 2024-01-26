/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package CheckoutControl;

import dao.CartDAO;
import entity.Account;
import entity.Cartandp;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author duyda
 */
@WebServlet(name = "test", urlPatterns = {"/checkout"})
public class CheckoutControl extends HttpServlet {

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
//lay phan gio hang 
        CartDAO cartDAO = new CartDAO();
         HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        int ida = a.getuID();
        List<Cartandp> listcart = cartDAO.Showlistbuy(ida);
        //tong tien 
        Double sumprice = 0.0;
        for (Cartandp o : listcart) {
            sumprice = (sumprice + o.getPrice())*o.getAmount();
        }
        request.setAttribute("sprice", sumprice);
        //thanhtoan 
        String patternTienTe = "###,###,000";
        DecimalFormat formatTienTe = new DecimalFormat(patternTienTe);
        String stringTienTe= formatTienTe.format(sumprice);           
        request.setAttribute("sprice", stringTienTe);
        //thanhtoan 
        Double pay = sumprice + 10000.0;
        String spay= formatTienTe.format(pay);         
        request.setAttribute("pay", spay);
        request.setAttribute("listP", listcart);
        request.getRequestDispatcher("checkout.jsp").forward(request, response);
//

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

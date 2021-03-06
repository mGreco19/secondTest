package service;

import com.google.gson.Gson;
import entities.forecast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.model;

/**
 *
 * @author Moises
 */
@WebServlet(name = "service", urlPatterns = {"/showForecast"})
public class service extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        switch(request.getServletPath()){
            case "/showForecast":
                this.showForecast(request, response);
                break;
        }
    }
    
    protected void showForecast(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        try{
            BufferedReader reader=request.getReader();
            Gson gson=new Gson();
            int dia=gson.fromJson(reader, Integer.class);
            int mes=gson.fromJson(reader, Integer.class);
            PrintWriter out = response.getWriter();
            List<forecast> list=model.instance().getForecast(dia, mes);
            response.setContentType("application/json; charset=UTF-8");
            out.write(gson.toJson(list));
            response.setStatus(200);
        }catch(Exception e){
            response.setStatus(401);
        }
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

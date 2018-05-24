package servlet;

import model.DAO.TrainsDAO;
import model.commands.ICommands;
import model.entity.Trains;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "Controller", urlPatterns = {
        ControllerHelper.VIEW_STATIONS,
        ControllerHelper.SEARCH_TRAINS,
})

public class Controller extends HttpServlet {
    //contains the list of all commands
    private ControllerHelper helper = ControllerHelper.getInstance();

//    private void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setCharacterEncoding("UTF8");
//        String page = null;
//            ICommands iCommand= helper.getCommandByKey(request);
//            page = iCommand.execute(request, response);
//            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(page);
//            dispatcher.forward(request, response);
//    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<String> clientApply = new ArrayList<String>();
          clientApply.add(request.getParameter("cityFrom"));
          clientApply.add(request.getParameter("cityTo"));
          clientApply.add(request.getParameter("date"));

          List<Trains> trains = TrainsDAO.findTrainByClientApp(clientApply);
          request.setAttribute("trains", trains);
          RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/trains.jsp");
          dispatcher.forward(request,response);
    }
}

package model.commands;

import model.DAO.StationsDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class ViewStationCommand implements ICommands {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page;
        StationsDAO stationDAO = new StationsDAO();
        HttpSession session = request.getSession(true);
        request.setAttribute("listOfStations", stationDAO.getAllStations());
        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
        return "WEB-INF/index.jsp";
    }
}

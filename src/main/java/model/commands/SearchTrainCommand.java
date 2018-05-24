package model.commands;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SearchTrainCommand implements ICommands {

    public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String page;
//        StationsDAO stationDAO = new StationsDAO();
//        HttpSession session = request.getSession(true);
//        request.setAttribute("listOfStations", stationDAO.getAllStationName());
//        request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
        return null;
    }
}

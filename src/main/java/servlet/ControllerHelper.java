package servlet;

import model.commands.ICommands;
import model.commands.NoCommand;
import model.commands.SearchTrainCommand;
import model.commands.ViewStationCommand;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Class designed to perform request mapping
 * and provide processing every request with relevant command
 */

public class ControllerHelper {
    private static ControllerHelper ourInstance;
    public static final String VIEW_STATIONS = "/view_stations";
    public static final String SEARCH_TRAINS = "/search_trains";
    public static final String ERROR_PAGE = "/error_page";
    private HashMap<String, ICommands> commands;

    private ControllerHelper() {
        commands = new HashMap<String, ICommands>();
        commands.put(VIEW_STATIONS, new ViewStationCommand());
        commands.put(SEARCH_TRAINS, new SearchTrainCommand());
        commands.put(ERROR_PAGE, new NoCommand());
    }

    public static ControllerHelper getInstance() {
        if (ourInstance == null)
            ourInstance = new ControllerHelper();
        return ourInstance;
    }

    public ICommands getCommandByKey(HttpServletRequest request){
        for (Map.Entry<String, ICommands> el : commands.entrySet()) {
           if(el.getKey().equals(request)) return el.getValue();
        }
        return commands.get(ERROR_PAGE);
    }
}

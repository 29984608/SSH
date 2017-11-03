package action;


import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by yang on 17-11-3.
 */
public class UserAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("action.......");
        return NONE;
    }
}

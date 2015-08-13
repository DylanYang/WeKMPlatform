package platform.controller;

import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.RequestParam;
import platform.DAO.HibernateUtils.HibernateUtil;
import platform.model.users.entity.UserEnity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


/**
 * Created by dylanyang on 8/13/15.
 */
@Controller
public class UsersController {
    Session session = null;
    Transaction tx = null;
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public String showUsersInfo(ModelMap map){
        session = HibernateUtil.getSession();
        List<UserEnity> list = session.createCriteria(UserEnity.class).addOrder(Order.desc("id")).list();
        map.addAttribute("users",list);
        session.close();
        return "users";
    }
    @RequestMapping(value = "/adduser",method = RequestMethod.GET)
    public String addUser(ModelMap map){
        UserEnity ue = new UserEnity();
        ue.setName("Danny");
        ue.setPasswd("kkk");
        ue.setAge(15);
        map.addAttribute("user", ue);
        return "add_user";
    }
    @RequestMapping(value = "/result",method = RequestMethod.GET)
    public String result(ModelMap map,@RequestParam String name,@RequestParam String passwd,@RequestParam int age,
                         HttpServletRequest request,HttpServletResponse response){
        session = HibernateUtil.getSession();
        tx = session.beginTransaction();

        UserEnity ue = new UserEnity();
        ue.setName(name);
        ue.setPasswd(passwd);
        ue.setAge(age);
        session.save(ue);

        tx.commit();
        session.close();

        return "result";
    }
}

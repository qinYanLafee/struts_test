package com.raycloud.action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.raycloud.bean.User;
import org.apache.struts2.interceptor.RequestAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class UserAction extends ActionSupport {
/*   private  String name;
    private  String password;
    private  String sex;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }


   public void validate() {
       if (user.getName() == null || "".equals(user.getName())) {
                 this.addFieldError("name", "姓名不能为空");
              }
     }*/
private User user;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String execute() throws Exception {
        return "reg";
    }
    public  String regExecute() throws Exception{
        User user1=new User("qinyan","qinyan123","男");
        Map<String,Object> map = (Map)ActionContext.getContext().get("request");
        map.put("user",user1);
        System.out.println("userName:"+user.getName()+"userPassword:"+user.getPassword()+"userSex:"+user.getSex());
        return "success";
    }
  /* public User getModel() {
        return this.user;
    }*/


}

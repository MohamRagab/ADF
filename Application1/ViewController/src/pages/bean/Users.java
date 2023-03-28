package pages.bean;

import com.sd.util.adf.ADFUtils;
import com.sd.util.db.DBUtil;

import javax.faces.event.ValueChangeEvent;

public class Users {
    
    public int list;

    public void setList(int list) {
        this.list = list;
    }

    public int getList() {
        return list;
    }

    public void populateStatusFL(ValueChangeEvent valueChangeEvent)
    {
        String cVal = valueChangeEvent.getNewValue()+"";
        setList(Integer.parseInt(cVal));
      if (cVal.equalsIgnoreCase("1"))
      {
        ADFUtils.setAttribute("UsersView1Iterator", "FullName", "xxxxxxxxxxxx");
      }
      else 
      {
          ADFUtils.setAttribute("UsersView1Iterator", "FullName", "yyyyyyyyyyyy");

      }
    }
}

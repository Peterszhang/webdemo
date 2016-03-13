<%@ page language="java" pageEncoding="UTF-8"%>
  <html>
    <head>
      <title>用户注册</title>
      <style type="text/css">
        input{width: 200px}
      </style>
      <script type="text/javascript">
      String.prototype.trim = function()
       {
       return this.replace(/(^\s*)|(\s*$)/g, "");
           } 
 
        
        //  验证日期
        function validateDate(date) 
        {
      
      var pos1 = date.indexOf("-");
      var pos2 = date.indexOf("-", pos1 + 1);
      if(pos1 == -1 || pos2 == -1) return false;
            
      var year = date.substr(0, pos1);
      var month = date.substr(pos1+1, pos2 - pos1 -1);
      var day = date.substr(pos2+1);
	    if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > 31) {
            return false;
        }
        if ((month == 4 || month == 6 || month == 9 || month == 11) &&
            (day == 31)) {
            return false;
        }
        if (month == 2) {
            var leap = (year % 4 == 0 &&
               (year % 100 != 0 || year % 400 == 0));
            if (day > 29 || (day == 29 && !leap)) {
                return false;
            }
        }
        return true;
    }
    function validate(form)
    {
        var username = form.username.value.trim();
        var password = form.password.value.trim();
        var repassword = form.repassword.value.trim();
        var age = form.age.value.trim();
        var birthday = form.birthday.value.trim();
        if(username == "" || username == null)
        {
            alert("用户名必须输入!");
            form.username.focus(); 
            return false;
        }        
        if(!/^\w*$/.test(username))
        {
            alert("用户名必须是字母和数字!");
            form.username.focus();
            return false; 
        }

        if(username.length <4 || username.length > 20)
        {
            alert("用户名的长度必须介于4和20之间!");
            form.username.focus();
            return false;  
        }
        if(password == "" || password == null)
        {
            alert("密码必须输入!");
            form.password.focus();
            return false;
        }
        if(password.length < 8 || password.length > 30)
        {
            alert("密码的长度必须介于8和30之间!");
            form.password.focus();
            return false; 
        }
        if(password != repassword)
        {
            alert("再次输入的密码不一致!");
            form.repassword.focus();
            return false;
        }
        if(age == "" || age == null)
        {
            alert("您的年龄必须输入!");
            form.age.focus();
            return false;
        }
        if(!/^[0-1]?[0-9]?[0-9]$/.test(age))
        {
            alert("您必须输入一个有效的年龄!");
            form.age.focus();
            return false;
        }
        if(birthday == "" || birthday == null)
        {
            alert("出生日期必须输入!");
            form.birthday.focus();
            return false;
        }
        if(!validateDate(form.birthday.value))
        {
            alert("出生日期输入不正确!");  
            form.birthday.focus();          
            return false;
        }
        return true;
            
    }
    function register(form)
    {
        if(validate(form))
            form.submit();
    }
      </script>
    </head>    
    <body>       
       <form action="register" method="post" >
           <table style="text-align: right;">
           <tr><td>用户名：</td>	
           <td><input type="text" name="username"/></td>
           </tr>
           <tr><td>密码：</td>	
           <td><input type="password" name="password"/></td>
           </tr>
           <tr><td>重新输入密码：</td>	
           <td><input type="password" name="repassword"/></td>
           </tr>
           <tr><td>年龄：</td>	
           <td><input type="text" name="age"/></td>
           </tr>
           <tr><td>生日：</td>	
           <td><input type="text" name="birthday"/></td>
           </tr>
           <tr><td></td>	
           <td><input type="button" value="注册" onclick="register(this.form)" style="width:50px"/></td>
           </tr>
           </table>
           
       </form>    
    </body>
  </html> 
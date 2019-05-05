$("#login").click(function(){
	var userName = $.trim($("#userName").val()),
        userPassword = $.trim($("#userPassword").val());
    if(userName == '' || userPassword == ''){
        alert("用户名和密码均不能为空！");
    }
    var data = {
            username: userName,
            password: userPassword
            }; 
    $.ajax({
    	type: "POST",
        url: "http://localhost:8080/user/login",
        data: data, 
        dataType: 'JSON',
        success:function(data){
        	if(data.status===true) {
                	alert("登录成功！");
            	}else{
                	alert("登录失败！");
            	}
        },
        error:function(){
        	alert("error!");
        }
    })
})

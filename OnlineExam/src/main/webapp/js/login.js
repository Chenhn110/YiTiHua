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
        url: "/user/login",
        data: data, 
        dataType: 'JSON',
        success:function(res){
        	alert("登录成功！");
        },
        error:function(){
        	alert("error!");
        }
    })
})
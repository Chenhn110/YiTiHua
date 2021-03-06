<html>
    <head>
        <base href="<%=basePath%>">
        <title>学生登录</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <style>
            body{
                height:100%;
                background:#16a085;
                overflow:hidden;
            }
            canvas{
                z-index:-1;
                position:absolute;
            }
        </style>
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/Particleground.js"></script>
        <script type="text/javascript" src="js/verificationNumbers.js"></script>
        <script type="text/javascript" src="js/login.js"></script>
        <script>
            $(document).ready(function() {
                //粒子背景特效
                $('body').particleground({
                    dotColor: '#5cbdaa',
                    lineColor: '#5cbdaa'
                });
                //验证码
                createCode();
            });
        </script>
    </head>
    <body>
        <dl class="admin_login">
            <dt>
                <strong>在线考试系统</strong>
                <em>Online Examination System</em>
            </dt>
            <dd class="user_icon">
                <input type="text" placeholder="账号" id="userName" class="login_txtbx"/>
            </dd>
            <dd class="pwd_icon">
                <input type="password" placeholder="密码" id="userPassword" class="login_txtbx"/>
            </dd>
            <dd class="val_icon">
                <div class="checkcode">
                    <input type="text" id="J_codetext" placeholder="验证码" maxlength="4" class="login_txtbx">
                    <canvas class="J_codeimg" id="myCanvas" onclick="createCode()">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
                </div>
                <input type="button" value="验证码核验" class="ver_btn" onClick="validate();">
            </dd>
            <dd>
                <input type="button" value="立即登陆" id="login" class="submit_btn"/>
            </dd>
            <dd>
                <p></p>
                <p></p>
            </dd>
        </dl>
    </body>
</html>

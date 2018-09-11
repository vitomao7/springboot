<#assign base=request.contextPath >
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Iotek在线书店-用户注册、登录</title>
    <link rel="stylesheet" href="${base}/css/common.css" />
    <link rel="stylesheet" href="${base}/css/login_register.css" />
<!--     <style type="text/css">
        @import url('css/common.css');
        @import url('css/login_register.css');
    </style> -->
    <!--|　|-->
</head>
<body>
    <header id="p_header">
        Iotek在线书店
        <div></div>
    </header>
    <article class="register">
        <form action="RegisterServlet.do" method="post">
            <header>用户注册</header>
            <p><label>用户名:</label><input name="userName"/></p>
            <p><label>密　码:</label><input name="userPwd" type="password"/></p>
            <p><label>验　证:</label><input name="name" type="password"/></p>
            <p><label>邮　箱:</label><input name="userEmail"/></p>
            <p><button type="submit">注　册</button></p>
        </form>
    </article> 
    
    
    <article class="login">
        <form action="login.do" method="post">
             <header>用户登录</header>
             <p><label>用户名:</label><input name="userName"/></p>
             <p><label>密　码:</label><input name="userPwd"  type="password"/></p>
             <p><button type="button">找回密码</button><button type="submit">登　录</button></p>
        </form>
    </article>
    <footer id="p_footer">
        <div></div>
        @Copyright <strong>iotek科技有限公司</strong>
    </footer>
</body>
</html>	
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户登录界面</title>
    <%@include file="/pages/common/head.jsp"%>
</head>
<body>
    <div id="login_header">
        <img class="logo_img" alt="" src="static/img/logo.gif">
    </div>
    <div class="login_banner">
        <div class="l_content">
            <span class="login_word">欢迎登录</span>
        </div>
        <div id="content">
            <div class="login_form">
                <div class="login_box">
                    <div class="tit">
                        <h1>书城会员</h1>
                        <a href="pages/user/regist.jsp">立即注册</a>
                    </div>
                    <div class="msg_cont">
                        <b></b>
                    <span class="errorMsg">
                        ${empty requestScope.msg?"请输入用户名和密码":requestScope.msg}
<%--                        <%=request.getAttribute("msg")==null?"请输入用户名和密码":request.getAttribute("msg")%>--%>
                    </span>
                    </div>
                    <div class="form">
                        <form action="userServlet" method="post">
                            <input type="hidden" name="action" value="login">
                            <label >用户名称:</label>
                            <input class="itxt" type="text" placeholder="用户名" autocomplete="off"
                                   tabindex="1" name="username"
                                   value="${requestScope.username}"/>
<%--                            value="<%=request.getAttribute("username")==null?"":request.getAttribute("username")%>" />--%>
                            <br />
                            <br />
                            <label>用户密码:</label>
                            <input class="itxt" type="password" placeholder="密码：6-16位字母或数字" autocomplete="off" tabindex="1" name="password" />
                            <br />
                            <br />
                            <input type="submit" value="登录" id="sub_btn" />
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
<%@include file="/pages/common/footer.jsp"%>
</body>
</html>
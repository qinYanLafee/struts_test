<%@ taglib prefix="s" uri="/struts-tags" %><span style="font-size:18px;">  <body>
<ul style="list-style-type: none;">
    <li>欢迎：<s:property value="#request.user.name"/>！</li>
    <li>您现在的密码是：<s:property value="#request.user.password"/></li>

    <%--<li>ongl标签您的性别是：<s:property value="#request.user.sex"/></li>--%>
    <li>EL表达式您的性别是：${user.sex}</li>

</ul>
</body>
</span>
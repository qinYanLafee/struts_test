<span style="font-size:18px;">  <body>
<h1>用户注册</h1>
<fieldset>
    <legend>注册信息</legend>
    <%--<form action="reg">
        <ul style="list-style-type: none;">
            <li>用户名：<input type="text" name="name">
            <li>密  码:   <input type="password"  name="password">
            <li>性  别:
                男<input type="radio" name="sex" id="male" value="male">
                女<input type="radio" name="sex" id="female" value="female">
            <li>提交信息是否正确:
                正确<input type="radio" name="validate" id="validate_true" value="true">
                错误<input type="radio" name="validate" id="validate_false" value="false">
            <li>  <input type="submit" value="注册">
        </ul>
    </form>--%>
    <form action="reg">
        <ul style="list-style-type: none;">
            <li>用户名：<input type="text" name="user.name">
            <li>密  码:   <input type="password"  name="user.password">
            <li>性  别:
                男<input type="radio" name="user.sex" id="male" value="male">
                女<input type="radio" name="user.sex" id="female" value="female">
            <li>提交信息是否正确:
                正确<input type="radio" name="validate" id="validate_true" value="true">
                错误<input type="radio" name="validate" id="validate_false" value="false">
            <li>  <input type="submit" value="注册">
        </ul>
    </form>
</fieldset>
</body></span>

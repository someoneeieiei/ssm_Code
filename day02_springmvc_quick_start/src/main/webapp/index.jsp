<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2023/7/5
  Time: 8:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <script src="js/code.jquery.com_jquery-3.7.0.js"></script>
    <title>index</title>
    <script type="text/javascript">
        alert("123");
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    type:"POST",
                    url:"/word/returnJsonToPojo",
                    data:JSON.stringify({id:"1",name:"zhishikeng",address:"成都"}),
                    contentType:"application/json;charset=utf-8"
                }).done(function (resp) {
                    alert(resp.name);
                    alert(resp.address);
                },"JSON");
            })
        })
    </script>
</head>
<body>
    哈哈
   <input type="button" value="点我" id="btn"/>

    <hr size="5" color="yellow">
    <h3>springmvc的本机文件上传</h3>
    <form action="/file/fileUpload1" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="uploadFile"/>
        <input type="submit" value="上传"/>
    </form>

    <hr size="5" color="yellow">
    <h3>springmvc的跨服文件上传</h3>
    <form action="/file/fileUpload2" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="uploadFile"/>
        <input type="submit" value="上传"/>
    </form>
</body>
</html>

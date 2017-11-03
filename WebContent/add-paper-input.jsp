<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script  type="text/javascript" src="My97DatePicker/WdatePicker.js"></script>
    <script  type="text/javascript" src="js/ChooseSort.js"></script>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
        <link rel="stylesheet" href="css/operation1.css">
    <title>论文管理器</title>  
  </head>
  <body>
  <div class="container">
   <header>
 <a href="index.jsp" id="index">论文管理器</a>
 <a href="#" id="right">注销</a>
 <a href="#" id="left">用户</a>
 </header>
 <hr>
 <div class="content2">
     <s:form name="form1" action="regpaper" method="post" enctype="multipart/form-data">
 
     <div id="parta">
    <h3>请输入论文的相应信息:</h3>
          选择文件: <input type="file" name="file">
    </div>
    <div id="partb">
      <s:textfield key="paperBean.author" label="论文作者" />
      <s:textfield key="paperBean.title" label="论文标题"/>
      <s:textfield key="paperBean.keyword" label="关键字"/>
      <s:textfield key="paperBean.publication" label="出版社"/>
    </div>
     <div id="partc">
     <span>请选择论文分类：</span>
     <br>
        <SELECT NAME="first" onChange="getSecond()" class="select">  
         <OPTION value="0">第一级目录 </OPTION> 
           <OPTION VALUE="1">基础学科 </OPTION>  
            <OPTION VALUE="2">工程科技</OPTION>  
            <OPTION VALUE="3">农业科技</OPTION>  
            <OPTION VALUE="4">医学卫生科技</OPTION>  
            <OPTION VALUE="5">哲学与人文科学</OPTION>
 			 <OPTION VALUE="6">社会科学</OPTION>  
            <OPTION VALUE="7">信息科学</OPTION>  
            <OPTION VALUE="8">经济管理科学</OPTION>  
        </SELECT>  
  

        <SELECT NAME="second" onChange="getThird()" class="select">  
            <OPTION value="0">第二级目录</OPTION>  
        </SELECT> 
  
        <select name="third" class="select">
        <option value="0">第三级目录</option>
        </select> 
        </div>
        <br>
        <div id="partd">
        <span>请选择发表日期：</span>
        <input name="dates" style="width: 120px;" onFocus="WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd '})" />
        </div>
        <div id="parte">
        <span>请保证您上传的论文已通过原作者的允许！</span>
         <s:submit class="btn btn-default"/>
	    </div>
	<hr />
	    </s:form>
	
	</div>
	<footer>
<br>
<span>Created by Group YST</span>
<br/>
<br/>
</footer>
	</div>


  </body>
</html>
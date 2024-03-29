<!doctype html>
<html lang="zh-CN">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>博客管理系统</title>
  <link rel="stylesheet" type="text/css" href="admin/css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="admin/css/style.css">
  <link rel="stylesheet" type="text/css" href="admin/css/font-awesome.min.css">
  <link rel="apple-touch-icon-precomposed" href="admin/images/icon/icon.png">
  <link rel="shortcut icon" href="admin/images/icon/favicon.ico">
  <script src="admin/js/jquery-2.1.4.min.js"></script>
</head>

<body class="user-select" style="overflow:hidden;">
<section class="container-fluid">
  <header>
    <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                  data-target="#bs-example-navbar-collapse-1" aria-expanded="false"><span class="sr-only">切换导航</span>
            <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span></button>
          <a class="navbar-brand" href="/">博客后台</a></div>
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
          <ul class="nav navbar-nav navbar-right">

            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                                    aria-expanded="false">admin <span class="caret"></span></a>
              <ul class="dropdown-menu dropdown-menu-left">
                <li><a title="查看或修改个人信息" data-toggle="modal" data-target="#seeUserInfo">个人信息</a></li>
              </ul>
            </li>
            <li><a href="login" onClick="if(!confirm('是否确认退出？'))return false;">退出登录</a></li>
            <li><a data-toggle="modal" data-target="#WeChat">帮助</a></li>
          </ul>

        </div>
      </div>
    </nav>
  </header>
  <div class="row">
    <aside class="col-sm-3 col-md-2 col-lg-2 sidebar">
      <ul class="nav nav-sidebar">
        <li class="active"><a href="main">报告</a></li>
      </ul>
      <ul class="nav nav-sidebar">
        <li><a href="categoryList">栏目管理</a></li>
        <li><a href="articleList">文章管理</a></li>
        <li><a href="messageList">留言管理</a></li>
        <li><a href="userList?page=1">用户管理</a></li>
        <li><a href="login">退出</a></li>
      </ul>
    </aside>
  </div>
</section>
<!--个人信息模态框-->
<div class="modal fade" id="seeUserInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <form action="" method="post">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                  aria-hidden="true">&times;</span></button>
          <h4 class="modal-title">个人信息</h4>
        </div>
        <div class="modal-body">
          <table class="table" style="margin-bottom:0px;">
            <thead>
            <tr></tr>
            </thead>
            <tbody>
            <tr>
              <td wdith="20%">姓名:</td>
              <td width="80%"><input type="text" value="王雨" class="form-control" name="truename" maxlength="10"
                                     autocomplete="off"/></td>
            </tr>
            <tr>
              <td wdith="20%">用户名:</td>
              <td width="80%"><input type="text" value="admin" class="form-control" name="username" maxlength="10"
                                     autocomplete="off"/></td>
            </tr>
            <tr>
              <td wdith="20%">电话:</td>
              <td width="80%"><input type="text" value="18538078281" class="form-control" name="usertel" maxlength="13"
                                     autocomplete="off"/></td>
            </tr>
            <tr>
              <td wdith="20%">旧密码:</td>
              <td width="80%"><input type="password" class="form-control" name="old_password" maxlength="18"
                                     autocomplete="off"/></td>
            </tr>
            <tr>
              <td wdith="20%">新密码:</td>
              <td width="80%"><input type="password" class="form-control" name="password" maxlength="18"
                                     autocomplete="off"/></td>
            </tr>
            <tr>
              <td wdith="20%">确认密码:</td>
              <td width="80%"><input type="password" class="form-control" name="new_password" maxlength="18"
                                     autocomplete="off"/></td>
            </tr>
            </tbody>
            <tfoot>
            <tr></tr>
            </tfoot>
          </table>
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
          <button type="submit" class="btn btn-primary">提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
<script src="/admin/js/bootstrap.min.js"></script>
<script src="/admin/js/admin-scripts.js"></script>
</body>
</html>

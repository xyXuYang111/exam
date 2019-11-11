<!doctype html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>修改用户 - 博客管理系统</title>
<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/admin/css/style.css">
<link rel="stylesheet" type="text/css" href="/admin/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="/admin/images/icon/icon.png">
<link rel="shortcut icon" href="/admin/images/icon/favicon.ico">
<script src="/admin/js/jquery-2.1.4.min.js"></script>

</head>

<body class="user-select" style="margin: 0px;padding: 0px;">
	<div>
      		<ul class="breadcrumb" style="margin: 0px;">
      			<li>用户管理</li>
      			<li>修改用户</li>
      		</ul>
      	</div>
 	
      <form action="" method="post" >
        <div class="form-group">
          	<label for="category-name">用户姓名</label>
          	<input type="text" id="category-name" name="userName" class="form-control" placeholder="在此处输入用户姓名" required autocomplete="off">
       </div>
       <div class="form-group">
          	<label for="category-name">电话号码</label>
          	<input type="text" id="category-name" name="userPhone" class="form-control" placeholder="在此处输入用户姓名" required autocomplete="off">
        </div> 
       <div class="form-group">
          	<label for="category-name">用户账号</label>
          	<input type="text" id="category-name" name="userPhone" class="form-control" placeholder="在此处输入用户账号" required autocomplete="off">
        </div> 
       <div class="form-group">
          	<label for="category-name">用户密码</label>
          	<input type="text" id="category-name" name="userPhone" class="form-control" placeholder="在此处输入用户密码" required autocomplete="off">
        </div> 
        <button class="btn btn-primary" type="submit" name="submit">添加用户</button>
      </form>
   
<script src="js/bootstrap.min.js"></script> 
<script src="js/admin-scripts.js"></script>
</body>
</html>

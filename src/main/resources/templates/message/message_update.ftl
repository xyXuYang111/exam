<!doctype html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>修改栏目 - 博客管理系统</title>
<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/admin/css/style.css">
<link rel="stylesheet" type="text/css" href="/admin/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="/admin/images/icon/icon.png">
<link rel="shortcut icon" href="/admin/images/icon/favicon.ico">
<script src="/admin/js/jquery-2.1.4.min.js"></script>

</head>

<body class="user-select" style="margin: 0px;padding: 0px;">
 		<h1 class="page-header" style="margin-top: 5px;">修改栏目</h1>
      <form action="/messageInfoUpdate" method="post">
        <div class="form-group">
          <label for="category-name">栏目名称</label>
          <input type="text" id="category-name" name="messageName" value="${messageName}" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
          <span class="prompt-text">这将是它在站点上显示的名字。</span> </div>
        <div class="form-group">
          <label for="category-alias">栏目别名</label>
          <input type="text" id="category-alias" name="alias" value="web" class="form-control" placeholder="在此处输入栏目别名" required autocomplete="off">
          <span class="prompt-text">“别名”是在URL中使用的别称，它可以令URL更美观。通常使用小写，只能包含字母，数字和连字符（-）。</span> </div>

        <div class="form-group">
          <label for="category-describe">描述</label>
          <textarea class="form-control" id="category-describe" name="messageContent" rows="4" autocomplete="off">这是栏目的描述这是栏目的描述这是栏目的描述这是栏目的描述</textarea>
        </div>
        <button class="btn btn-primary" type="submit" name="submit">更新</button>
      </form>
   
<script src="admin/js/bootstrap.min.js"></script>
<script src="admin/js/admin-scripts.js"></script>
</body>
</html>

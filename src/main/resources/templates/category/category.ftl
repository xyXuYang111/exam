<!doctype html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>栏目 - 博客管理系统</title>
<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/admin/css/style.css">
<link rel="stylesheet" type="text/css" href="/admin/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="images/icon/icon.png">
<link rel="shortcut icon" href="/admin/images/icon/favicon.ico">
<script src="/admin/js/jquery-2.1.4.min.js"></script>
</head>
<body class="user-select" style="margin: 0px;padding: 0px;">
	<div>
      		<ul class="breadcrumb" style="margin: 0px;">
      			<li>栏目管理</li>
      			<li>栏目查询和添加</li>
      		</ul>
      	</div>
      	<br/>
  <div class="row">
        <div class="col-md-5">

          <form action="categoryAdd" method="post" autocomplete="off">
            <div class="form-group">
              <label for="category-name">栏目名称</label>
              <input type="text" id="category-name" name="categoryName" class="form-control" placeholder="在此处输入栏目名称" required autocomplete="off">
              <span class="prompt-text">这将是它在站点上显示的名字。</span> </div>
            <div class="form-group">
              <label for="category-alias">栏目别名</label>
              <input type="text" id="category-alias" name="categoryAlias" class="form-control" placeholder="在此处输入栏目别名" required autocomplete="off">
              <span class="prompt-text">“别名”是在URL中使用的别称，它可以令URL更美观。通常使用小写，只能包含字母，数字和连字符（-）。</span> </div>
            <div class="form-group">
              <label for="category-describe">描述</label>
              <textarea class="form-control" id="category-describe" name="categoryDesc" rows="4" autocomplete="off"></textarea>
              <span class="prompt-text">描述会出现在网页的description属性中。</span> </div>
            <button class="btn btn-primary" type="submit" name="submit">添加新栏目</button>
          </form>
        </div>
        <div class="col-md-7">
     
          <div class="table-responsive">
            <table class="table table-striped table-hover">
              <thead>
                <tr>
                  <th>ID</th>
                  <th>名称</th>
                  <th>别名</th>
                  <th>总数</th>
                  <th>操作</th>
                </tr>
              </thead>
              <#if categoryInfoList ??>
                <#list categoryInfoList as items>
                  <tbody>
                  <tr>
                    <td>${items_index +1}</td>
                    <td>${items.categoryName}</td>
                    <td>${items.categoryAlias}</td>
                    <td>125</td>
                    <td><a href="getCategoryUpdate?categoryId=${items.categoryId}">修改</a>
                      <a href="getCategoryDelete?categoryId=${items.categoryId}">删除</a></td>
                  </tr>
                  </tbody>
                </#list>
              </#if>
            </table>
            <span class="prompt-text"><strong>注：</strong>删除一个栏目也会删除栏目下的文章和子栏目,请谨慎删除!</span> </div>
        </div>
</div>
<script src="js/bootstrap.min.js"></script> 
<script src="js/admin-scripts.js"></script> 
<script>
//是否确认删除
$(function(){   
	$("#main table tbody tr td a").click(function(){
		var name = $(this);
		var id = name.attr("rel"); //对应id  
		if (event.srcElement.outerText === "删除") 
		{
			if(window.confirm("此操作不可逆，是否确认？"))
			{
				$.ajax({
					type: "POST",
					url: "/Category/delete",
					data: "id=" + id,
					cache: false, //不缓存此页面   
					success: function (data) {
						window.location.reload();
					}
				});
			};
		};
	});   
});
</script>
</body>
</html>

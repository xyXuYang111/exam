<!doctype html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>文章 - 博客管理系统</title>
<link rel="stylesheet" type="text/css" href="/admin/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/admin/css/style.css">
<link rel="stylesheet" type="text/css" href="/admin/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="/admin/images/icon/icon.png">
<link rel="shortcut icon" href="/admin/images/icon/favicon.ico">
<script src="/admin/js/jquery-2.1.4.min.js"></script>
</head>
<body class="user-select" style="margin: 0px;padding: 0px;">

      <form action="/articleList" method="get" class="form-inline" >
        <div>
          <ul class="breadcrumb" style="margin: 0px;">
            <li>文章管理</li>
            <li>文章查询</li>
          </ul>
        </div>
        <div class="row alert alert-info">
          <div class="form-group">
            <input type="text" name="articleTitle" class="form-control" placeholder="请输入文章的标题"/>
            <input type="submit" value="查询" class="btn btn-info "/>
            <a href="/getArticleAdd" class="btn btn-info ">增加文章</a>
          </div>
        </div>

        <div class="table-responsive">
          <table class="table table-striped table-hover">
            <thead>
              <tr>
                <th>选择</th>
                <th>标题</th>
                <th>栏目</th>
                <th>日期</th>
                <th>操作</th>
              </tr>
            </thead>
            <tbody>
            <#if articleInfoList ??>
                <#list articleInfoList as items>
                  <tr>
                    <td><input type="checkbox" class="input-control" name="checkbox[]" value="${items.articleId}" /></td>
                    <td class="article-title">${items.articleTitle}</td>
                    <td>${items.articleContent}</td>
                    <td>2015-12-03</td>
                    <td><a href="getArticleUpdate?articleId=${items.articleId}">修改</a>
                      <a href="articleDelete?articleId=${items.articleId}">删除</a></td>
                  </tr>
                </#list>
            </#if>
            </tbody>
          </table>
        </div>
        <footer class="message_footer">
          <nav>
            <div class="btn-toolbar operation" role="toolbar">
              <div class="btn-group" role="group"> <a class="btn btn-default" onClick="select()">全选</a> <a class="btn btn-default" onClick="reverse()">反选</a> <a class="btn btn-default" onClick="noselect()">不选</a> </div>
              <div class="btn-group" role="group">
                <button type="submit" class="btn btn-default" data-toggle="tooltip" data-placement="bottom" title="删除全部选中" name="checkbox_delete">删除</button>
              </div>
            </div>
            <ul class="pagination pagenav">
              <li class="disabled"><a aria-label="Previous"> <span aria-hidden="true">&laquo;</span> </a> </li>
              <li class="active"><a href="#">1</a></li>
              <li><a href="#">2</a></li>
              <li><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li><a href="#">5</a></li>
              <li><a href="#" aria-label="Next"> <span aria-hidden="true">&raquo;</span> </a> </li>
            </ul>
          </nav>
        </footer>
      </form>
<script src="/admin/js/bootstrap.min.js"></script> 
<script src="/admin/js/admin-scripts.js"></script> 
</body>
</html>

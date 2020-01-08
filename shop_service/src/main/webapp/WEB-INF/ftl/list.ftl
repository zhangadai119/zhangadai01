<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>freemarker_springboot</title>
</head>
<body>

	<#assign shop = shop/>
	
	<table>
		<tr>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>商品价格</td>
			<td>状态</td>
		</tr>
		<tr>
			<td>${shop.id}</td>
			<td>${shop.shopname}</td>
			<td>${shop.price}</td>
			<td>${shop.status}</td>
		</tr>
	</table>
</body>
</html>
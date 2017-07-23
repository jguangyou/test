<%@ page isELIgnored="false"  %>
<html>
<body>
<h2>Hello World!</h2>

<form action="./con1" method="POST">
	<input type="text" name="param" value="sdfsdfsdfsad">
	<input type="submit" value="Test"/>
	<input type="text" value=${customer1.name}>
	<h6>${customer1.name}</h6>
</form>
</body>
</html>

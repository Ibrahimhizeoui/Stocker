<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<form:form action="" method="POST" modelAttribute="product">
<form:label path="name">Name</form:label>
<form:input path="name" />

<form:label path="price">price</form:label>
<form:input path="price" />

<form:label path="quantity">quantity</form:label>
<form:input path="quantity" />

<form:label path="description">description</form:label>
<form:textarea path="description" rows="5" cols="30" />

<input type="submit" value="add" name="submit">
</form:form>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="col-md-8" >
        <form:form action="" method="POST" modelAttribute="category" role="form">
        
        <br style="clear:both">
                    <h3 style="margin-bottom: 25px; text-align: center;">Category Form</h3>
    				<div class="form-group">
    					<form:input path="name" class="form-control" placeholder="Name" />
					</div>
					
					<div class="form-group">
						<label for="sel1">Select Category:</label>
						<form:select path="categoryId" class="form-control">
   							<form:option value="0" label="--- Select ---"/>
   							<form:options items="${categories}" itemLabel="name" itemValue="id"/>
						</form:select>
					</div>
		<input type="submit" class="btn btn-primary pull-right" />
        </form:form>
        </div>
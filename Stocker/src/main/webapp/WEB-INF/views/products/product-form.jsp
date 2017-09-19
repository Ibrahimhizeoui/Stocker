<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<div class="col-md-8" >
        <form:form action="" method="POST" modelAttribute="product" role="form">
        
        <br style="clear:both">
                    <h3 style="margin-bottom: 25px; text-align: center;">Product Form</h3>
    				<div class="form-group">
    					<form:input path="name" class="form-control" placeholder="Name" />
					</div>
					<div class="form-group">
						<form:input path="price"  class="form-control" placeholder="Price"/>
					</div>
					<div class="form-group">
						<form:input path="quantity" class="form-control" placeholder="Quatity" />
					</div>
					<div class="form-group">
						<label for="sel1">Select Category:</label>
						<form:select path="categoryId" class="form-control">
   							
   							<form:options items="${categories}" itemLabel="name" itemValue="id"/>
						</form:select>
					</div>
					<div class="form-group">
						<input type="file" class="form-control" />
					</div>
                    <div class="form-group">
                    	<form:textarea path="description" rows="5" cols="30" class="form-control" placeholder="Description"/>
                    </div>
            
       				 <input type="submit" class="btn btn-primary pull-right" />
        </form:form>
        </div>
  
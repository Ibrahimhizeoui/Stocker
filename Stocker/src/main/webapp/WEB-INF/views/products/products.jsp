<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<h3 id="test">list of product</h3>
<button class="btn btn-primary" data-toggle="modal" data-target="#exampleModal1">Add product</button>
<div class="modal fade" id="exampleModal1" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <jsp:include page="product-form.jsp" />
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
            
          </div>
        </div>
      </div>
    </div>
<div class="card mb-3">
          <div class="card-header">
            <i class="fa fa-table"></i>
            Data Table Example
          </div>
          <div class="card-body">
            <div class="table-responsive">
              <table class="table table-bordered" width="100%" id="dataTable" cellspacing="0">
                <thead>
                  <tr>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Category</th>
                    <th>Added at</th>
                    <th>Action</th>
                  </tr>
                </thead>
                <tfoot>
                  <tr>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Category</th>
                    <th>Added at</th>
                    <th>Action</th>
                  </tr>
                </tfoot>
                        <tbody>
               <c:forEach var="product" items="${lists}">
                <tr role="row" class="odd">
                	<td class="sorting_1">${product.name}</td>
                	<td>${product.price}</td>
                	<td>${product.quantity}</td>
                	<td>category</td>
                	<td>${product.createdAt}</td>
					<td>
						<a href="products/edit/${product.id}"><i class="fa fa-edit" aria-hidden="true"></i></a>
						<a href="products/show/${product.id}"><i class="fa fa-id-card-o" aria-hidden="true"></i></a> 
						<a href="products/delete/${product.id}"><i class="fa fa-window-close" aria-hidden="true"></i></a>
					</td>
					
                    
                  </tr>
                  </c:forEach>
                  </tbody>
              </table>
           </div>
          </div>
          <div class="card-footer small text-muted">
            Updated yesterday at 11:59 PM
          </div>
        </div>
           
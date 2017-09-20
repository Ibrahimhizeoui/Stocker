<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


    <div class="row">
		<div class="col-md-4">
            
                <div class="row">
                    <div class="col-md-12">
                        <img src="C:\xampp\htdocs\jee-lab\.metadata\.plugins\org.eclipse.wst.server.core\tmp1\work\Catalina\localhost\Stocker\tmp\${product.id}" class="img-rounded" alt="Cinque Terre" width="210" height="210">    
                    </div>
                </div>
                <div class="row" style="margin-top: 5px">
                    <div class="col-md-3">
                        <img src="http://placehold.it/70x70" class="img-rounded" alt="Cinque Terre" width="70" height="70">    
                    </div>
                    <div class="col-md-3">
                        <img src="http://placehold.it/70x70" class="img-rounded" alt="Cinque Terre" width="70" height="70">    
                    </div>
                    <div class="col-md-3">
                        <img src="http://placehold.it/70x70" class="img-rounded" alt="Cinque Terre" width="70" height="70">    
                    </div>
                </div>
        
		</div>
        <div class="col-md-8">
             <div class="product-title">${product.name}</div>
        			<div class="product-desc"><b>Category :</b> ${category.name}</div>
                    <div class="product-desc"><b>Quantity :</b> ${product.quantity}</div>
                    <div class="product-desc"><b>Created at</b> ${product.createdAt}</div>
                    <div class="product-desc"><b>Updated at</b> ${product.updatedAt}</div>
					<hr>
					<div class="product-price">$ ${product.price}</div>
			</div>   
        </div>
	</div>
    <hr>
    <div class="row">
        <div class="col-md-12">
    		<ul class="nav nav-tabs nav_tabs">
				<li class="active"><a href="#service-one" data-toggle="tab">DESCRIPTION</a>
                 <p>${product.description} </p>			
                 </li>
			</ul>
        </div>
    </div>
    <div class="row">
        <div class="col-md-1 col-md-offset-11">
            <button type="button" class="btn btn-primary">Primary</button>
        </div>
    </div>
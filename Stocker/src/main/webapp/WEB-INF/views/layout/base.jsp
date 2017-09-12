<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="t"%>
<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <meta name="description" content="">
    <meta name="author" content="">
    <title><t:getAsString name="title" /></title>

    <!-- Bootstrap core CSS -->
    
	<link href="<c:url value='/resources/vendor/bootstrap/css/bootstrap.min.css' />"  rel="stylesheet"></link>
    <!-- Custom fonts for this template -->
    <link href="<c:url value='/resources/vendor/font-awesome/css/font-awesome.min.css' />"  rel="stylesheet" type="text/css">

    <!-- Plugin CSS -->
    <link href="<c:url value='/resources/vendor/datatables/dataTables.bootstrap4.css' />"  rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="<c:url value='/resources/css/sb-admin.css' />"  rel="stylesheet">

  </head>

  <body class="fixed-nav sticky-footer bg-dark" id="page-top">
  
  <!-- menu is here -->
  <t:insertAttribute name="header" />
  
  <div class="content-wrapper">

      
      <!-- body is here -->
      <t:insertAttribute name="body" />

    </div>
    
    <!-- footer is here -->
    <t:insertAttribute name="footer" />
    
    <a class="scroll-to-top rounded" href="#page-top">
      <i class="fa fa-angle-up"></i>
    </a>

    <!-- Logout Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            Select "Logout" below if you are ready to end your current session.
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
            <a class="btn btn-primary" href="login.html">Logout</a>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript -->
    <script src="<c:url value='/resources/vendor/jquery/jquery.min.js' /> "></script>
    <script src="<c:url value='/resources/vendor/popper/popper.min.js' /> "></script>
    <script src="<c:url value='/resources/vendor/bootstrap/js/bootstrap.min.js' /> "></script>

    <!-- Plugin JavaScript -->
    <script src="<c:url value='/resources/vendor/jquery-easing/jquery.easing.min.js' /> "></script>
    <script src="<c:url value='/resources/vendor/chart.js/Chart.min.js' />" ></script>
    <script src="<c:url value='/resources/vendor/datatables/jquery.dataTables.js' /> "></script>
    <script src="<c:url value='/resources/vendor/datatables/dataTables.bootstrap4.js' />"></script>

    <!-- Custom scripts for this template -->
    <script src="<c:url value='/resources/js/sb-admin.min.js' /> "></script>

  </body>

</html>
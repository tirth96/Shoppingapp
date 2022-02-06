<%
	String msg = (String)session.getAttribute("user_name");
	String loginSuccess = (String)session.getAttribute("user_email");
	if(msg != null){
%>
	<div class="alert alert-success alert-dismissible fade show" role="alert">
  		<strong><%= msg %></strong>
  		<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
	</div>
	<div class="alert alert-success alert-dismissible fade show" role="alert">
  		<strong><%= loginSuccess %></strong>
  		<button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
	</div>
<%
		session.removeAttribute("user_name");
		session.removeAttribute("user_email");
	}



%>
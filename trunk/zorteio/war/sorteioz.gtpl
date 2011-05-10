<html>
	<body>
		<center>
		<p><font size="32">$request.num</font></p>
		<% if (request.premio != null) { %>
		<p>$msg.prize: $request.premio</p>
		<% } %>
		<% if (request.email != null) { %>
		<p>$msg.name: $request.nome</p>
		<% } 
		if (request.email != null) { %>
		<form action="/sendmail" method="POST">
		<input type="hidden" name="nome" value="$request.nome" />
		<input type="hidden" name="email" value="$request.email" />
		<input type="hidden" name="premio" value="$request.premio" />
		<p>$msg.email: $request.email</p>
		<p><input type="submit" value="$msg.confirmAndSendMail" /></p>
		</form>
		<% } %>
		</p>
		</center>
	</html>
</body>


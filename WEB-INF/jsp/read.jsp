<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="main.java.Topic,java.util.List"%>

<!--CasleyTalk
-->

<html>
<body>

<h2>CasleyTalk</h2>

<a href="read">再読み込み</a>
<br>
<br>
<form action="post" method="Post">
	タイトル<input type="text" name="title" size="40">
	<br>
	<br>
	<textarea name="content" rows="5" cols="40"></textarea>
	<br>
	<input type="submit" value="投稿">
</form>

<%
List topics = (List)request.getAttribute("topics");
if(topics != null){
	for(int i = topics.size()-1; i >= 0; i--){
		Topic topic = (Topic)topics.get(i);
%>
		<hr>
		タイトル <%=topic.getTitle() %>
		(<%=topic.getPostDate()%>)
		<pre><%=topic.getContent() %></pre>
<%
	}
}
%>
</body>
</html>
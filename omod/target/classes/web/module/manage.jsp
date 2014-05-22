<%@ include file="/WEB-INF/template/include.jsp"%>
<%@ include file="/WEB-INF/template/header.jsp"%>

<%@ include file="template/localHeader.jsp"%>

<p>Hello ${user.systemId}!</p>
<form action="manage.form" method="POST">
id: <input type="text" name="id"><br>
bpReading: <input type="text" name="bpreading">
patient_id: <input type="text" name="patient_id">
<input type="submit"/>
</form>
<%@ include file="/WEB-INF/template/footer.jsp"%>
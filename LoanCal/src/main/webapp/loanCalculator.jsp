<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Loan Calculator</h2>
    <form action="calculateLoan.jsp" method="post">
        <label>Principal Loan Amount:</label>
        <input type="number" name="principal" required><br>

        <label>Period of Time (in years):</label>
        <input type="number" name="years" required><br>

        <input type="submit" value="Calculate">
    </form>
</body>
</html>
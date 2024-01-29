<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <h2>Loan Calculation Results</h2>

    <%
        double principal = Double.parseDouble(request.getParameter("principal"));
        int years = Integer.parseInt(request.getParameter("years"));

        double[] interestRates = {5.35, 5.5, 5.75};

        for (double rate : interestRates) {
            double monthlyRate = rate / 100 / 12;
            int numberOfPayments = years * 12;

            double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -numberOfPayments));

            out.println("<h3>Loan Details for " + years + " years at " + rate + "% interest rate:</h3>");
            out.println("<table border='1'>");
            out.println("<tr><th>Payment #</th><th>Payment Amount</th><th>Loan Balance</th><th>Interest Paid</th></tr>");

            double loanBalance = principal;

            for (int i = 1; i <= numberOfPayments; i++) {
                double interestPaid = loanBalance * monthlyRate;
                double principalPaid = monthlyPayment - interestPaid;

                loanBalance -= principalPaid;

                out.println("<tr>");
                out.println("<td>" + i + "</td>");
                out.println("<td>" + monthlyPayment + "</td>");
                out.println("<td>" + loanBalance + "</td>");
                out.println("<td>" + interestPaid + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
        }
    %>

</body>
</html>
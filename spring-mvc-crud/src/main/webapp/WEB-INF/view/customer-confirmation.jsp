<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Customer Confirmation</title>
</head>

<body>

The customer is confirmed: ${customer.firstName} ${customer.lastName}

<br><br>

Free Passes: ${customer.freePass}

<br><br>

Postal Code: ${customer.postalCode}

<br><br>

Email: ${customer.email}



</body>

</html>

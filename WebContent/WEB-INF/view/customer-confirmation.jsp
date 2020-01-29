<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>


<html>
	<title>Customer Confirmation</title>
<head>


</head>




<body>


The customer is confirmed: ${customer.firstName} ${customer.lastName} 
<br>
FreePasses : ${customer.freePasses} 
<br>
Postal Code: ${customer.postalCode}
<br>
Course Code: ${customer.courseCode}
</body>


</html>
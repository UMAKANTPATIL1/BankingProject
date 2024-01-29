<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>
</head>
<body>

<form action="deposit"method="post">
  <div class="container">
    <h1>Deposit Amount</h1>
    
    <hr>
    <label for="account"><b>Account Number </b></label>
    <input type="text" placeholder="Enter Account Number" name="accNo" id="accNo" required>
    
    
    <label for="balance"><b>Deposit Amount</b></label>
    <input type="text" placeholder="Enter Deposit Amount" name="balance" id="deposit" required>

    
    

    <button type="submit" class="registerbtn">Deposit</button>
  </div>
  
  <div class="container signin">
  <p>Go To View Account <a href="viewPage">View Account</a>.</p>
   <p>Go To Create Account <a href="createAccount">Create Account</a>.</p>
   
    <p>Go To Deposite Money <a href="depositAmount">Deposite Money</a>.</p>
    <p>Go To Withdraw Money <a href="withdrawAmount">Withdraw Money</a>.</p>
  </div>
</form>

</body>
</html>
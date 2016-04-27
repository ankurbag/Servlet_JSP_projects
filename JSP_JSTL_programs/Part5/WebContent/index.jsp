<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>ASPCA Pet Health</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="bootstrap.min.css">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <script src="http://code.jquery.com/ui/1.10.0/jquery-ui.js"></script>
  
  
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  
</head>
<body>
<jsp:declaration>String submittedFlag="false";</jsp:declaration>

<jsp:scriptlet>
    if(request.getParameter("submittedFlag") !=null){
    	submittedFlag = "true";
    }
	if(submittedFlag.equalsIgnoreCase("false")){
</jsp:scriptlet>
<div class="container" style="border: 2px solid #73AD21;">
<!--General Information -->
   <div class="row" style="padding-top:20px">
		<div class="col-lg-12 col-md-12 col-sm-12 text-center">
        <img src="images/logo.PNG" alt="Pet health Insurance" />
        </div>
        <div class="col-lg-6 col-md-6 col-sm-12">
        	<h2>Claim Form</h2>
            
        </div>
        <div class="col-lg-6 col-md-6 col-sm-12 text-right">
        <a href="#" class="btn btn-info btn-lg">
          <span class="glyphicon glyphicon-earphone"></span> Call us at 1-866-204-6764
        </a>
        </div>
        <hr color="#73AD21">
   </div>    
  <form action="index.jsp?submittedFlag=true" method="post">
  <div class="row">
    <h2>
        	<span class="label label-success">1</span>  General Information 
    </h2>
        
  	<div class="col-xs-6 col-md-6">
        <div class="panel panel-default">
          <div class="panel-heading">Your Information</div>
          <div class="panel-body">
          	  <div class="form-group">
                    <label for="">Name:</label>
                    <input type="text" class="form-control" required name="username">
                  </div>
                  <div class="form-group">
                    <label for="pwd">Address:</label>
                    <input type="text" class="form-control" required name="address">
                  </div>
                  <div class="form-group">
                    <label for="pwd">City,State,Zip:</label>
                    <input type="text" class="form-control" required name="city">
                  </div>
                  <div class="form-group">
                    <label for="pwd">Phone:</label>
                    <input type="number" class="form-control" required name="phone">
                  </div>
              </div>
    	</div>
     </div>
    <!-- row - left-->
    <div class="col-xs-6 col-md-6">
		<div class="panel panel-default">
	      <div class="panel-heading">Pets Information</div>
    	  <div class="panel-body">
          	  <div class="form-group">
                    <label for="">Account Number:</label>
                    <input type="number" class="form-control" required name="accountno">
                  </div>
                  <div class="form-group">
                    <label for="pwd">Name:</label>
                    <input type="text" class="form-control" required name="petname">
                  </div>
                  <div class="form-group">
                    <label for="pwd">Breed:</label>
                    <input type="text" class="form-control" required name="breed">
                  </div>
                  <div class="form-group">
                    <label for="pwd">Age:</label>
                    <input type="number" class="form-control" max="100" min="1" required name="age">
                  </div>
              </div>
    	</div>
    	
    </div>
    <!-- row -right-->
    </div>
    
   <!--Diagnosis/Symptom Information --> 
   <div class="row">
    <h2>
        	<span class="label label-success">2</span>  Diagnosis/Symptom Information 
    </h2>
        
  	<div class="col-xs-12 col-md-12">
        <div class="panel panel-default">
          <div class="panel-heading">Story of occurrences/diagnosis</div>
          <div class="panel-body"><textarea class="form-control" placeholder="Please describe this incident, including dates, details and symptoms leading up to it." required name="story" style="resize:none"></textarea></div>
    	</div>
        
        <div class="panel panel-default">
          <div class="panel-heading">Help Us!</div>
          <div class="panel-body">
          	<div class="col-xs-6 col-md-6">
            	This claim is related to:
                <div class="checkbox"><label><input type="checkbox" name="claimCheckBox" value="Accident"> Accident</label>
                <label><input type="checkbox" name="claimCheckBox" value="Illness"> Illness</label><label><input type="checkbox" name="claimCheckBox" value="Accident"> Wellness</label>
                </div>
                <div class="form-group">
                    <label for="pwd">Is this claim an estimate for future treatment:</label>
                    <div class="radio"><label><input type="radio" name="claimRadio" value="Yes"> Yes</label>
                		<label><input type="radio" name="claimRadio" value="No"> No</label>
                	</div>
                </div>
                <div class="form-group">
                    <label for="pwd">Total Amount Claimed:</label>
                    <input type="number" class="form-control" id="pwd" min="0" name="totalAmt" required>
                  </div>
                  <div class="form-group">
                    <label for="pwd">Date of illness:</label>
                    <input type="date" class="form-control datepicker" id="pwd" name="illnessDate" required>
                  </div>
                Send payment to:
                <div class="checkbox"><label><input type="checkbox" name="claimCheckBox2" value="Me" > Me</label>
                <label><input type="checkbox" name="claimCheckBox2" value="Vet"> Vet</label>
                </div>
  			</div>
            
            <div class="col-xs-6 col-md-6">
            	<div class="form-group">
                    <label for="">Veterinarian:</label>
                    <input type="text" class="form-control" required name="vetName">
                  </div>
                  <div class="form-group">
                    <label for="pwd">Clinic name:</label>
                    <input type="text" class="form-control" required name="clinicName">
                  </div>
                  <div class="form-group">
                    <label for="pwd">Phone Number:</label>
                    <input type="number" class="form-control" required min="0" name="phoneNum2">
                  </div>
                  Did any other vet check your pet?
                  <div class="radio">
                    <label>
                      <input type="radio" name="vetRadio" value="Yes">
                      Yes</label>
                    <label>
                      <input type="radio" name="vetRadio" value="No">
                      No</label>
                  </div>
                Is this a new condition?<div class="radio">
                <div class="radio">
                    <label>
                      <input type="radio" name="vetRadio2" value="Yes">
                      Yes</label>
                    <label>
                      <input type="radio" name="vetRadio2" value="No">
                      No</label>
                  </div>
                </div>
            </div>
          </div>
    	</div>
     </div>
    <!-- row - left-->
    
    </div>
    
    <!--Pet Owner Declaration --> 
   <div class="row">
    <h2>
        	<span class="label label-success">3</span>  Pet Owner Declaration 
    </h2>
        
  	<div class="col-xs-12 col-md-12">
        <div class="panel panel-default">
          <div class="panel-heading">Please read IMPORTANT NOTICE document</div>
          <div class="panel-body">I confirm to the best of my knowledge the above statements are true in every respect. I understand that the fees listed may not be covered or may
exceed my plan benefit. I understand that I am financially responsible to my veterinarian for the entire treatment. I understand that this claim
cannot be adjusted without itemized receipts. I also understand that the deliberate misrepresentation of the animal's condition or the omission of
any material facts may result in the denial of the claim and/or the cancellation of coverage. I authorize United States Fire Insurance Company and
its business partners to review and obtain a copy of ALL RECORDS including the insurance claim records and medical records as to examination,
history, diagnosis, treatment and prognosis with respect to any condition. I further authorize these entities to disclose identifying information about
me and my pet, as well as information about my claim experience, to my veterinarian.
          <div class="form-group">
               <label for="pwd">Signature:</label>
               <input type="text" class="form-control" name="signature" required>
          </div>
          <div class="form-group">
               <label for="pwd">Date:</label>
               <input type="text" class="form-control datepicker" id="" name="signingDate" required>
          </div>
          <button type="submit" class="btn btn-success btn-sm">Submit</button>
          </div>
    	</div>
     </div>
    <!-- row - left-->
    
    <!-- row -right-->
    </div>
    </form>
    
 </div>
 <jsp:scriptlet>
	}else{
</jsp:scriptlet>
 <!-- Output -->
 
 <div class="container" style="border: 2px solid #73AD21;">
		<!--General Information -->
		<div class="row" style="padding-top: 20px">
			<div class="col-lg-12 col-md-12 col-sm-12 text-center">
				<img src="images/logo.PNG" alt="Pet health Insurance" />
			</div>
			<div class="col-lg-12 col-md-12 col-sm-12">
				<h4>
					<img src="images/success.gif" alt="Pet health Insurance" />You
					have successfully Submitted the following data</h4>
			</div><hr color="red">
		</div>

		<div class="panel panel-success">
			<div class="panel-heading">General Information</div>
			<div class="panel-body">
				<table class="table table-responsive">
					<tr>
						<td>Name</td>
						<td><jsp:expression>request.getParameter("username")</jsp:expression></td>
					</tr>
					<tr>
						<td>Address:</td>
						<td><jsp:expression>request.getParameter("address")</jsp:expression></td>
					</tr>
					<tr>
						<td>City:</td>
						<td><jsp:expression>request.getParameter("city")</jsp:expression></td>
					</tr>
					<tr>
						<td>Phone:</td>
						<td><jsp:expression>request.getParameter("phone")</jsp:expression></td>
					</tr>
					<tr>
						<td>Account Number:</td>
						<td><jsp:expression>request.getParameter("accountno")</jsp:expression></td>
					</tr>
					<tr>
						<td>Pet Name:</td>
						<td><jsp:expression>request.getParameter("petname")</jsp:expression></td>
					</tr>
					<tr>
						<td>Age:</td>
						<td><jsp:expression>request.getParameter("age")</jsp:expression></td>
					</tr>

				</table>
			</div>
		</div>

		<div class="panel panel-success">
			<div class="panel-heading">Diagnosis/Symptom Information</div>
			<div class="panel-body">
				<table class="table table-responsive">
					<tr>
						<td>This claim is related to:</td>
						<td>
						<jsp:scriptlet>
						String claims[] = request.getParameterValues("claimCheckBox");
						int i=0;
						if(claims !=null){
						for(i=0; claims.length > i;i++){
						</jsp:scriptlet>
							<li><jsp:expression> claims[i]</jsp:expression></li>
							
						<jsp:scriptlet>}}</jsp:scriptlet>
						</td>
						
					</tr>
					<tr>
						<td>Veterinarian:</td>
						<td><jsp:expression>request.getParameter("vetName")</jsp:expression></td>
					</tr>
					<tr>
						<td>Is this claim an estimate for future treatment:</td>
						<td><jsp:expression>request.getParameter("claimRadio")</jsp:expression></td>
					</tr>
					<tr>
						<td>Clinic name:</td>
						<td><jsp:expression>request.getParameter("clinicName")</jsp:expression></td>
					</tr>
					<tr>
						<td>Total Amount Claimed:</td>
						<td><jsp:expression>request.getParameter("username")</jsp:expression></td>
					</tr>
					<tr>
						<td>Phone Number:</td>
						<td><jsp:expression>request.getParameter("username")</jsp:expression></td>
					</tr>
					<tr>
						<td>Send payment to:</td>
						<td>
							<li>Me</li> <br>
							<li>Vet</li> <br>
						</td>
					</tr>
					<tr>
						<td>Did any other vet check your pet?</td>
						<td><jsp:expression>request.getParameter("username")</jsp:expression></td>
					</tr>
					<tr>
						<td>Is this a new condition?</td>
						<td><jsp:expression>request.getParameter("username")</jsp:expression></td>
					</tr>
				</table>
			</div>
		</div>

		<div class="panel panel-success">
			<div class="panel-heading">Story</div>
			<div class="panel-body">
				<table class="table table-responsive">
					<tr>
						<td><jsp:expression>request.getParameter("story")</jsp:expression></td>
					</tr>

				</table>
			</div>
		</div>

		<div class="panel panel-success">
			<div class="panel-heading">Pet Owner Declaration</div>
			<div class="panel-body">
				<table class="table table-responsive">
					<tr>
						<td>Signature:</td>
						<td><jsp:expression>request.getParameter("username")</jsp:expression></td>
					</tr>
					<tr>
						<td>Date:</td>
						<td><jsp:expression>request.getParameter("username")</jsp:expression></td>
					</tr>
				</table>
			</div>
		</div>
	</div>
 <jsp:scriptlet>
	}
</jsp:scriptlet>
   <script>
  $(function() {
    $( ".datepicker" ).datepicker();
  });
  </script>

</body>
</html>

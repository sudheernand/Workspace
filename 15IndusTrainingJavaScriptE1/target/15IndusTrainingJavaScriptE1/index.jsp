<!DOCTYPE html>
<html>


<head>

<script type="text/javascript" src="calculator.js">
	
</script>

<script type="text/javascript" src="sub.js">
	
</script>

<script type="text/javascript">
	function mul() {

		param1 = document.getElementById("param1").value;

		param2 = document.getElementById("param2").value;

		var result = parseInt(param1) * parseInt(param2);

		document.getElementById("result").value = result;

		//	alert(result);

	}
</script>



</head>


<body>

	<script type="text/javascript">
		function div() {

			param1 = document.getElementById("param1").value;

			param2 = document.getElementById("param2").value;

			var result = parseInt(param1) / parseInt(param2);

			document.getElementById("result").value = result;

			//	alert(result);

		}
	</script>



	<h1 align="center">Calculator</h1>

	<div align="center">

		<form name="form">

			Parameter 1:<input type="text" id="param1" /> <br> <br>
			Parameter 2:<input type="text" id="param2" /> <br> <br> <input
				type="radio" onclick="add()" /> Addition<br> <input
				type="radio" onclick="sub()" /> Subtract<br> <input
				type="radio" onclick="mul()" /> Multiply<br> <input
				type="radio" onclick="div()" /> Division<br>
				 <br>
				  Result:<input type="text" id="result" value="0" />

		</form>
	</div>


</body>





</html>
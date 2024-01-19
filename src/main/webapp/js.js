//Register Form
function checkPassword(){
	if(document.getElementById("pwd").value!=document.getElementById("confirmpwd").value)
	{
		alert("Password Mismatched");
		return false;
	}
	else
	{
		return true;
	}
}
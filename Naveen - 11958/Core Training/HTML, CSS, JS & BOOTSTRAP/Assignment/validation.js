function registerValidation(){
    var fnameRegEx = '^[A-Z a-z]+$';
    var lnameRegEx = '^[A-Z a-z]+$';
    var fname1RegEx = '^[A-Z a-z]+$';
    var mname1RegEx = '^[A-Z a-z]+$';
    var numRegEx = '^[0-9]+$';
    var emailRegEx = '[a-z0-9]+@[a-z]+\.[a-z]{2,3}$';
    var passwordRegEx = '^[a-zA-Z0-9!@#$%^&*]{6,16}$';
    var addressRegEx = '^[A-Z a-z 0-9]+$';
    var fname = document.getElementById("fname").value;
    var lname = document.getElementById("lname").value;
    var fname1 = document.getElementById("fname1").value;
    var mname1 = document.getElementById("mname1").value;
    var address = document.getElementById("address").value;
    var num = document.getElementById("num").value;
    var email = document.getElementById("email").value;
    var password = document.getElementById("pwd").value;
    var password1 = document.getElementById("pwd1").value;

    
    if(fname == ""){
        alert("First name can not be empty");
    }
    else if(! fname.match(fnameRegEx)){
        alert("Invalid First Name");
    }

    else if(lname == ""){
        alert("Last name can not be empty");
    }
    else if(! lname.match(lnameRegEx)){
        alert("Invalid Last Name");
    }

    else if(fname1 == ""){
        alert("Father name cannot be empty")
    }
    else if(! fname1.match(fname1RegEx)){
        alert("Invalid Father Name");
    }

    else if(mname1 == ""){
        alert("Mother name cannot be empty")
    }
    else if(! mname1.match(mname1RegEx)){
        alert("Invalid Mother Name");
    }

    else if(address == ""){
        alert("Address cannot be empty");
    }
    else if(! address.match(addressRegEx)){
        alert("Enter valid Address");
    }
    
    else if(select == "course"){
        alert("Please Select any of one course");
    }

    else if(num == ""){
        alert("Phone Number cannot be empty");
    }
    else if(! num.match(numRegEx)){
        alert("Phone Number is not valid");
    }

    else if(email == ""){
        alert("Email can not be empty");
    }
    else if(! email.match(emailRegEx)){
        alert("Enter valid email address")
    }

    else if(password == ""){
        alert("Password is must");
    }
    else if(! password.match(passwordRegEx)){
        alert("Enter Valid Password!")
    }

    else if(password1 == ""){
        alert("enter the password once again")
    }
    else if(! password1.match(password)){
        alert("Retype the password again!")
    }


    
}

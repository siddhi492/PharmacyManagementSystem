function validateLogin() {
    const user = document.getElementById("username").value;
    const pass = document.getElementById("password").value;
    if (user === "" || pass === "") {
        alert("Both fields are required.");
        return false;
    }
    return true;
}


document.getElementById("contactForm")
.addEventListener("submit", function(event) {
    event.preventDefault();

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let message = document.getElementById("message").value.trim();
    let result = document.getElementById("result");

    if (name === "" || email === "" || message === "") {
        result.style.color = "red";
        result.textContent = "Please fill in all fields.";
    } else {
        result.style.color = "green";
        result.textContent =
            "Thank you, " + name + "! Your message is ready.";

        document.getElementById("contactForm").reset();
    }
});

signInForm.addEventListener("submit", async (e) => {
  e.preventDefault();

  const username = document.querySelector("#signin-username").value;
  const password = document.querySelector("#signin-password").value;

  if (!username || !password) {
    console.log("Please fill in all fields");
    return;
  }

  try {
    const res = await fetch("http://localhost:8080/api/users/login", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ username, password })
    });
    const data = await res.json();

    if (data.success) {
      console.log("Login successful! Role: " + data.role);
      // redirect based on role
      if (data.role === "admin") window.location.href = "admin-dashboard.html";
      else if (data.role === "alumni") window.location.href = "alumni-dashboard.html";
      else window.location.href = "student-dashboard.html";
    } else {
      console.log("Invalid username or password");
    }
  } catch (err) {
    console.error("Error during login", err);
  }
});

signUpForm.addEventListener("submit", async (e) => {
  e.preventDefault();

  const username = document.querySelector("#signup-username").value;
  const email = document.querySelector("#signup-email").value;
  const password = document.querySelector("#signup-password").value;
  const role = document.querySelector("#role-select").value;

  if (!username || !email || !password || !role) {
    console.log("Please fill in all fields and select a role");
    return;
  }

  if (password.length < 6) {
    console.log("Password must be at least 6 characters long");
    return;
  }

  try {
    const res = await fetch("http://localhost:8080/api/users/signup", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({ username, email, password, role })
    });
    const data = await res.json();
    console.log("Account created successfully as " + data.role);
    signUpForm.reset();
  } catch (err) {
    console.error("Error during signup", err);
  }
});

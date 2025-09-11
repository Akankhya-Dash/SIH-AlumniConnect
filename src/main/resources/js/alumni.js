async function fetchJobs() {
  const res = await fetch("http://localhost:8080/api/jobs");
  return await res.json();
}

async function renderJobsGrid() {
  const grid = document.getElementById('jobs-grid');
  if (!grid) return;
  const jobs = await fetchJobs();
  grid.innerHTML = '';
  jobs.forEach(j => {
    const el = document.createElement('article');
    el.className = 'card job-card';
    el.innerHTML = `
      <h2>${esc(j.title)}</h2>
      <p><strong>Company:</strong> ${esc(j.company)}</p>
      <p><strong>Location:</strong> ${esc(j.location)}</p>
      <p>${esc(j.desc)}</p>
    `;
    grid.appendChild(el);
  });
}

function initPostJobForm() {
  const form = document.getElementById('post-job-form');
  if (!form) return;
  const titleEl = document.getElementById('job-title');
  const companyEl = document.getElementById('job-company');
  const locationEl = document.getElementById('job-location');
  const descEl = document.getElementById('job-desc');

  form.addEventListener('submit', async (ev) => {
    ev.preventDefault();
    const job = {
      title: titleEl.value,
      company: companyEl.value,
      location: locationEl.value,
      desc: descEl.value
    };
    await fetch("http://localhost:8080/api/jobs", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(job)
    });
    window.location.href = 'view-jobs.html';
  });
}

async function renderRequests() {
  const container = document.getElementById('requests-container');
  if (!container) return;
  const res = await fetch("http://localhost:8080/api/mentorship");
  const list = await res.json();
  container.innerHTML = '';
  list.forEach(r => {
    const card = document.createElement('div');
    card.className = 'card request-card';
    card.innerHTML = `
      <h3>Student: ${esc(r.name)}</h3>
      <p><strong>Email:</strong> ${esc(r.email)}</p>
      <p>${esc(r.message)}</p>
      <span>Status: ${r.status}</span>
    `;
    container.appendChild(card);
  });
}

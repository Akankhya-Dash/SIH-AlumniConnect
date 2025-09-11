// Post Announcements
if (postBtn) {
  postBtn.addEventListener('click', async () => {
    const title = document.getElementById('title').value;
    const content = document.getElementById('content').value;
    if (title && content) {
      await fetch("http://localhost:8080/api/announcements", {
        method: "POST",
        headers: { "Content-Type": "application/json" },
        body: JSON.stringify({ title, content })
      });
      alert(`Announcement Posted:\n${title}\n${content}`);
      document.getElementById('title').value = '';
      document.getElementById('content').value = '';
    } else {
      alert('Please fill both fields');
    }
  });
}

// View Opportunities
async function loadOpportunities() {
  const container = document.getElementById('opportunitiesContainer');
  if (!container) return;
  const res = await fetch("http://localhost:8080/api/opportunities");
  const opportunities = await res.json();
  opportunities.forEach(o => {
    const card = document.createElement('div');
    card.className = 'opportunity-card';
    card.innerHTML = `<h3>${o.title}</h3>
                      <p><strong>Type:</strong> ${o.type}</p>
                      <p><strong>Posted By:</strong> ${o.postedBy}</p>`;
    container.appendChild(card);
  });
}
loadOpportunities();

async function fetchAlumni() {
  const res = await fetch("http://localhost:8080/api/alumni");
  window._alumni = await res.json();
}

document.addEventListener('DOMContentLoaded', async () => {
  await fetchAlumni();
  const searchBtn = document.getElementById('search-btn');
  if (searchBtn) {
    searchBtn.addEventListener('click', (e) => {
      e.preventDefault();
      searchAlumni();
    });
  }
});

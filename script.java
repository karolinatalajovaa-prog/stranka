document.addEventListener("DOMContentLoaded", () => {
    const page = document.querySelector(".page");
    if (page) page.classList.add("active");
});

document.addEventListener("click", (e) => {
    const link = e.target.closest("a");
    if (!link) return;

    const href = link.getAttribute("href");
    if (!href || href.startsWith("http")) return;

    e.preventDefault();

    const page = document.querySelector(".page");
    if (page) {
        page.classList.remove("active");
        page.classList.add("exit");
    }

    setTimeout(() => {
        window.location.href = href;
    }, 300);
});
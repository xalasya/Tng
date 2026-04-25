const audio = document.getElementById("myAudio");
const playBtn = document.getElementById("playBtn");
const icon = document.getElementById("icon");
const volumeSlider = document.getElementById("volumeSlider");

function toggleAudio() {
    if (audio.paused) {
        audio.play();
        icon.innerHTML = "⏸"; // Pause icon
    } else {
        audio.pause();
        icon.innerHTML = "▶"; // Play icon
    }
}

volumeSlider.addEventListener("input", (e) => {
    audio.volume = e.target.value;
})
window.addEventListener('click', () => {
    const audio = document.getElementById("myAudio");
    if (audio.paused) {
        audio.play();
        document.getElementById("icon").innerHTML = "⏸";
    }
}, { once: true }); // Tanha yakam jar ka klik krd ish dakat
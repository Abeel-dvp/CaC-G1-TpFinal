
// Botón modo nocturno-----------------------------------------------------------

const btnSwitch = document.querySelector('#switch');

const toggleDarkMode = () => {
    document.body.classList.toggle('dark');
    btnSwitch.classList.toggle('active');

    const isDarkMode = document.body.classList.contains('dark');

    document.querySelectorAll('th, td, h1').forEach(element => {
        element.classList.toggle('normal', isDarkMode);
    });

    localStorage.setItem('dark-mode', String(isDarkMode));
};

btnSwitch.addEventListener('click', toggleDarkMode);

// Obtenemos el modo actual.
const savedDarkMode = localStorage.getItem('dark-mode') === 'true';
document.body.classList.toggle('dark', savedDarkMode);
btnSwitch.classList.toggle('active', savedDarkMode);

document.querySelectorAll('th, td, h1').forEach(element => {
    element.classList.toggle('normal', savedDarkMode);
});
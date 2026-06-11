const carouselImages = [
    {
        src: 'https://images.unsplash.com/photo-1550547660-d9450f859349?auto=format&fit=crop&w=1200&q=80',
        caption: 'Hambúrguer artesanal com pão fresquinho e queijo derretido.'
    },
    {
        src: 'https://images.unsplash.com/photo-1517248135467-4c7edcad34c4?auto=format&fit=crop&w=1200&q=80',
        caption: 'Nossos lanches são preparados com ingredientes selecionados.'
    },
    {
        src: 'https://images.unsplash.com/photo-1540189549336-e6e99c3679fe?auto=format&fit=crop&w=1200&q=80',
        caption: 'Um ambiente acolhedor para celebrar em família.'
    }
];

let carouselIndex = 0;
const carouselImage = document.getElementById('carouselImage');
const carouselCaption = document.getElementById('carouselCaption');
const prevButton = document.querySelector('.carousel-control.prev');
const nextButton = document.querySelector('.carousel-control.next');

function updateCarousel() {
    const item = carouselImages[carouselIndex];
    carouselImage.src = item.src;
    carouselImage.alt = item.caption;
    carouselCaption.textContent = item.caption;
}

function showNext() {
    carouselIndex = (carouselIndex + 1) % carouselImages.length;
    updateCarousel();
}

function showPrev() {
    carouselIndex = (carouselIndex - 1 + carouselImages.length) % carouselImages.length;
    updateCarousel();
}

prevButton.addEventListener('click', showPrev);
nextButton.addEventListener('click', showNext);
setInterval(showNext, 6000);
updateCarousel();

const reservationForm = document.getElementById('reservationForm');
const formMessage = document.getElementById('formMessage');

reservationForm.addEventListener('submit', function(event) {
    event.preventDefault();
    const name = document.getElementById('name').value.trim();
    const guests = document.getElementById('guests').value.trim();
    const email = document.getElementById('email').value.trim();
    const phone = document.getElementById('phone').value.trim();

    if (!name || !guests || !email || !phone) {
        formMessage.textContent = 'Por favor, preencha todos os campos para concluir a reserva.';
        return;
    }

    const emailValid = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    const phoneValid = /^\(?\d{2}\)?\s?9?\d{4}-?\d{4}$/;

    if (!emailValid.test(email)) {
        formMessage.textContent = 'Por favor, insira um e-mail válido.';
        return;
    }

    if (!phoneValid.test(phone)) {
        formMessage.textContent = 'Por favor, insira um celular válido no formato (11) 90000-0000.';
        return;
    }

    formMessage.textContent = `Reserva recebida! Entraremos em contato em breve para confirmar sua mesa para ${guests} pessoa(s).`;
    formMessage.style.color = '#2f5138';
    reservationForm.reset();
});

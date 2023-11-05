	// Sticky Navbar
    let header = document.querySelector('header');
    let menu = document.querySelector('#menubar');
    let navbar = document.querySelector('.navbar');
     
     
    window.addEventListener('scroll', () => {
        header.classList.toggle('shadow', window.scrollY > 0);
    });
     
    menu.onclick = () => {
        navbar.classList.toggle('active');
    }
    window.onscroll = () => {
        navbar.classList.remove('active');
    }
     function resume(){
        window.open("https://drive.google.com/file/d/1I3_HYPPrcLr9X4OQlN7a6jjiLO696lV7/view?usp=sharing","_blank");
     }
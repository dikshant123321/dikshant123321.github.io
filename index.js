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
        // window.open("https://drive.google.com/drive/folders/1v1T2fP6pALLtHX5qXAKN3AFK_1QvW3Qo","_blank");
     }
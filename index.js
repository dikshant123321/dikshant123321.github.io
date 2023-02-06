console.log("workind")

function myOppener(){
    let x=document.getElementById("textnav");
    x.style.right='0px';
   
}

function myCloser(){
    let x=document.getElementById("textnav");
    x.style.right='-200px';
}

function mail(){
    
}

let x=1;
function menu(){
    if(x==0)
    {
    document.getElementById("menubar").innerHTML=`<i class="fa-solid fa-bars"></i>`;
    document.getElementById("navbar").style.display=`none`;

    x=1;
    }
    else{
        document.getElementById("menubar").innerHTML=`<i class="fa-solid fa-xmark"></i>`;
        
        let z=document.getElementById("navbar");
        z.style.display=`block`;
        z.style.marginLeft=`75%`;
        z.style.fontSize=`80%`;
    //    let a=document.getElementById("navbar");
    //    a.style.gap=`20px`;
        
        x=0;
    }
}
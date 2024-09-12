let play = document.getElementById("play");
let stop = document.getElementById("stop");
let imagenArray = document.getElementsByClassName("imagen");

window.onload = function (){
    
    for(let i=1; i<49; i++){
        let contenedor = document.getElementById("contenedor");
        let imagen = document.createElement("img");
        imagen.src = "cartas/"+i+".jpg";
        imagen.id = i;
        imagen.className = "imagen";
        imagen.alt = "cara";
        contenedor.appendChild(imagen);
    }

    
}

let miIntervalo;
let contador = 0;
let playActivo = 0;

play.addEventListener("click", function volteo() {
    playActivo = playActivo+1;
    if(playActivo == 1){

        miIntervalo = setInterval(() => {
            if(contador == 48){
                contador = 0;
            }
            contador = contador+1;
            darLaVuelta(contador);
        }, 100);
    
    }
    
});


stop.addEventListener("click", function() {
    clearInterval(miIntervalo);
    playActivo = 0;

});

function darLaVuelta(i){
        let imagenAvoltear = document.getElementById(i);
        let imagenAlt = imagenAvoltear.alt;
        
        //console.log(imagenAlt);


        if(imagenAlt == "cruz"){
            let imagen = document.getElementById(i);
            imagen.src = "cartas/"+i+".jpg";
            imagen.alt = "cara";
            //console.log("imagenCruz");
        }
        if(imagenAlt == "cara"){
            let imagen = document.getElementById(i);
            imagen.src = "cartas/dorso.jpg";
            imagen.alt = "cruz";
            //console.log("imagenCara");

        }


}

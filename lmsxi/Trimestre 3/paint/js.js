window.onload = function (){
    let conainer = document.getElementById("container");
    let paleta = document.getElementById("paleta");
    let colorSeleccionado = "color1";
    let boton = document.getElementById("boton");

    for(let i=1; i<21; i++){
        for(let j=1; j<21; j++){
            let celda = document.createElement("div");
            celda.id = i+"-"+j
            celda.classList.add("celda");
            conainer.appendChild(celda);


            celda.addEventListener("click", function(){
                celda.className = "celda";
                celda.classList.add(colorSeleccionado);
            });

            boton.addEventListener("click", function(){
                celda.className = "celda";

            });

        }
    }

    for(let i=1; i<21; i++){
        let celdaPaleta = document.createElement("div");
        celdaPaleta.id = "color"+i;
        celdaPaleta.classList.add("celdaPaleta", "color"+i);
        paleta.appendChild(celdaPaleta);

        celdaPaleta.addEventListener("click", function(){
            colorSeleccionado = celdaPaleta.id;

            borrarHoverCeldasPaleta();
            celdaPaleta.classList.remove("celdaPaleta");
            celdaPaleta.classList.add("celdaPaletaFocus");
        });
    }

    function borrarHoverCeldasPaleta (){
        let celdasPaleta = document.querySelectorAll(".celdaPaletaFocus");
        celdasPaleta.forEach(function(celda){
            celda.classList.remove("celdaPaletaFocus");
            celda.classList.add("celdaPaleta");
        });
    }
}
while (true){
    variable = prompt ('Escribe alguna orden:');
    if(variable.toLowerCase()=="salir"){
        break;
    }else if(variable.isBlank){
        alert ('Introduce algo!');
    }else if(isNaN(variable)){
        alert (variable +' no es un numero');
    }else{
        alert (variable +' es un numero');
    }
}

alert ('Adios!');

function mostrarImagen(imageId, opacity, times) {
    console.log(`ImageID: ${imageId}`);
    console.log(`Opcity: ${opacity}`);
    console.log(`Times: ${times}`);
    var imagen = document.getElementById(imageId);
    imagen.style.opacity = 0;

    setTimeout(function () {
      imagen.style.display = "block";
      imagen.style.opacity = 0;
    }, 0);

    setTimeout(function () {
      imagen.style.opacity = opacity[0];
    }, times[0]);

    setTimeout(function () {
      imagen.style.opacity = opacity[1];
    }, times[1]);

    setTimeout(function () {
      imagen.style.opacity = 0;
    }, times[2]);

    setTimeout(function () {
      imagen.style.opacity = "0";
      imagen.style.display = "none";
    }, 8000);
  }

